package dictionarygraphicapi;

import java.io.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;


//
public class DictionaryManagment {

    //Hàm lấy word từ một file txt ( commandLine V1)
    public static void insertFromFile() {
        try {
            FileInputStream fis = new FileInputStream("Dictionary.txt");
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();
            while(line != null) {
                String newOneLine = line.replace("\ufeff", "");
                String []arr = newOneLine.split("\t");
                Dictionary.WordArr.add(new Word(arr[0], arr[1]));
                line = br.readLine();
            }
            br.close();
            isr.close();
            fis.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //hàm lấy toàn bộ từ vào một model để chuẩn bị in ra list
    public static DefaultListModel showAllWord() {
        DefaultListModel model = new DefaultListModel();
        for( int i=0; i<Dictionary.WordArr.size(); i++) {
            model.addElement(Dictionary.WordArr.get(i).word_target);
        }
        return model;
    }
    

    //Hàm tìm kiếm nhị phân
    public static int binarySearch( ArrayList<Word> WordArr, String word) {
        int left = 0;
        int right = WordArr.size()-1;
        int middle = 0;
        while ( right >= left) {
            middle = ( right + left ) / 2;
            if( word.equals(Dictionary.WordArr.get(middle).word_target) ) {
                return middle;
            }
            if( word.compareTo( WordArr.get(middle).word_target) > 0 ) {
                left = middle + 1;
            }
            else if( word.compareTo( WordArr.get(middle).word_target) <0 ){
                right = middle - 1;
            }
        }
        return -1;
    }

    //Hàm trả về vị trí của từ wordTarget
    public static int DictionaryLookup( String wordTarget ) {
        wordTarget = wordTarget.toLowerCase();
        int index = binarySearch( Dictionary.WordArr, wordTarget);
        return index;
    }

    //Hàm thêm dữ liệu
    public static void insertWord(Word w) {
        int sizeOfWordArr = Dictionary.WordArr.size();
        for( int i=0; i<sizeOfWordArr; i++) {
            String wordArrIndexOfI = Dictionary.WordArr.get(i).word_target;
          
            if( wordArrIndexOfI.compareTo( w.word_target ) > 0) {
                Dictionary.WordArr.add( i, w);
                break;
            }
            else if( i == Dictionary.WordArr.size()-1) {
                Dictionary.WordArr.add( i+1, w);
                break;
            }
        }
        dictionaryExportToFile();
    }
    
    //Hàm xuất dữ liệu từ điển hiện tại ra file
    public static void dictionaryExportToFile() {
        File dic = new File("Dictionary.txt");
        try(PrintWriter pw = new PrintWriter(dic)) {
            for( int i=0; i<Dictionary.WordArr.size(); i++) {
                pw.println( Dictionary.WordArr.get(i).word_target + "\t" + Dictionary.WordArr.get(i).word_explain);
            }
        }
        catch (Exception e) {

        }
    }

    //Hàm sửa dữ liệu (commandLine V2)
    public static void setWord(String wordTargetSetting, String newExplain) {
        wordTargetSetting = wordTargetSetting.toLowerCase();
        int index = binarySearch( Dictionary.WordArr, wordTargetSetting); //lấy vị trí của từ cần sửa
        Dictionary.WordArr.get(index).word_explain = newExplain; //sửa nghĩa của từ
        dictionaryExportToFile();
    }

    //Hàm xóa dữ liệu ( commandLine V2)
    public static void deleteWord(String wordDelete) {
        wordDelete = wordDelete.toLowerCase();
        int index = binarySearch( Dictionary.WordArr, wordDelete);
        Dictionary.WordArr.remove(index);
        dictionaryExportToFile();
    }

    //Hàm search từ (CommandLine V2)
    public static DefaultListModel searchWord(String wordSearching) {
        wordSearching = wordSearching.toLowerCase();
        DefaultListModel model = new DefaultListModel();
        for( int i=0; i<Dictionary.WordArr.size(); i++)  {
            if( Dictionary.WordArr.get(i).word_target.length() < wordSearching.length()) {
                continue;
            }
            else if( Dictionary.WordArr.get(i).word_target.substring(0, wordSearching.length()).equals(wordSearching)) {
                model.addElement(Dictionary.WordArr.get(i).word_target);
            }
        }
        return model;
    }

   
    //Hàm in ra nghĩa của một từ
    public static String printWord(String explain) {
        String kindOfWord = ""; 
        String pronounce = ""; 
        String outPut = "";
        int index1 = 0;
        int index2 = 0;
        for( int i=0; i<explain.length(); i++) {
            if( explain.charAt(i) == '.') {
                kindOfWord = explain.substring(0, i);
                index1 = i;
                break;
            }
        }
        for( int i=explain.length()-1; i>=0; i--) {
            if( explain.charAt(i) == '/') {
                pronounce = explain.substring(index1+2, i+1);
                index2 = i;
                break;
            }
        }
        int numOfExplain = 1;
        int firstIndex = 0;
        int lastIndex = 0;
        
        if( kindOfWord.equals("") == true && pronounce.equals("") == true) {
            lastIndex = 0;
        }
        else if(kindOfWord.equals("") == false && pronounce.equals("") == true) {
            outPut = "- " + kindOfWord + "<br>";
            lastIndex = index1 + 2;
        }
        else if( kindOfWord.equals("") == true && pronounce.equals("") == false) {
            outPut = "- " + pronounce + "<br>";
            lastIndex = index2+2;
        }
        else {
            outPut = "- " + kindOfWord + "<br>" + "- " + pronounce + "<br>";
            lastIndex = index2 + 2;
        }
        
        
        for( int i=index2; i<explain.length(); i++) {
            if( explain.charAt(i) == ';') {
                firstIndex = lastIndex;
                lastIndex = i;
                outPut = outPut + " " + numOfExplain + ".  " + explain.substring(firstIndex, lastIndex) + "<br>";
                numOfExplain++;
            }
            else if( i == explain.length()-1) {
                outPut = outPut + " " + numOfExplain + ".  " + explain.substring(lastIndex) + "<br>";
            }
        }
        outPut = "<html>" + outPut + "<html>";
        return outPut;
    }
}


