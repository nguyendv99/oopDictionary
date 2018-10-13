package DicV2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


//
public class DictionaryManagment {
    //Hàm insertFromCommandline() để nhập từ vựng và nghĩa từ bàn phím( commandLine V0)
    public static void insertFromCommandline() {

        Scanner scn = new Scanner(System.in);
        System.out.print("Input number of word: ");
        int NumOfWord = scn.nextInt();
        scn.nextLine();

        for (int i = 0; i < NumOfWord; i++) {
            Word w = new Word("", "");
            //  System.out.print("Nhap target thu " + i + ": ");
            w.word_target = scn.nextLine();

            //  System.out.print("Nhap explain thu " + i + ": ");
            w.word_explain = scn.nextLine();
            Dictionary.WordArr.add(w);
        }

    }

    //Hàm lấy word từ một file txt ( commandLine V1)
    public static void insertFromFile() {

       File fileDic = new File( "./File/Dictionary2.txt" );

       try( Scanner scn = new Scanner( fileDic)) {
           while ( scn.hasNextLine()) {

               Word word = new Word( "", ""); //Tao ra mot bien kieu Word

               String oneLine = scn.nextLine(); //Lấy nội dung một dòng text lưu vào biến oneLine
               oneLine = oneLine.toLowerCase();

               int countTarget = 0;
               String newOneLine = oneLine.replace( "\ufeff", "");

               for( int i=0; i<newOneLine.length(); i++) { //vòng for để lưu biến word_target
                   if( newOneLine.charAt( i ) == 9 ) {
                       countTarget = i;
                       word.word_target = newOneLine.substring( 0, countTarget);
                       break;
                   }
               }

               for( int i=countTarget; i<newOneLine.length(); i++) {
                   if( newOneLine.charAt( i ) != 9) {
                       word.word_explain = newOneLine.substring( i);
                       break;
                   }
               }

               Dictionary.WordArr.add( word ); //Lưu biến Word vào ArrayList WordArr

           }


       }
       catch ( IOException ex) {
           System.err.println( ex.getMessage());
       }
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

    //Hàm DictionaryLookup có chức năng tra cứu từ ( commandLine V1)
    public static void DictionaryLookup( ArrayList<Word> WordArr ) {
        System.out.print( "Input a word to look up: ");
        Scanner scn = new Scanner( System.in);
        String wordLookup = scn.nextLine();
        wordLookup = wordLookup.toLowerCase();

        int index = binarySearch( WordArr, wordLookup);
        if( index == -1) {
            System.out.println( "Sorry! My dictionary do not have " + wordLookup + " word.");
        }
        else {
            System.out.print( "Meaning: ");
            System.out.println( Dictionary.WordArr.get(index).word_explain );
        }

    }

    //Hàm thêm dữ liệu ( commandLine V2)
    public static void insertWord( ) {
        Scanner scn = new Scanner( System.in);

        Word w = new Word( "", "");

        System.out.print( "Input a english word you want to insert: ");
        w.word_target = scn.nextLine();
        w.word_target = w.word_target.toLowerCase();
        System.out.print( "Input the meaning: ");
        w.word_explain = scn.nextLine();
        w.word_explain = w.word_explain.toLowerCase();

        int sizeOfWordArr = Dictionary.WordArr.size();
        for( int i=0; i<sizeOfWordArr; i++) {
            String wordArrIndexOfI = Dictionary.WordArr.get(i).word_target;
            if( wordArrIndexOfI.equals(w.word_target)) {
                System.out.println("This word is already exist!");
                break;
            }
            else if( wordArrIndexOfI.compareTo( w.word_target ) > 0) {
                Dictionary.WordArr.add( i, w);
                System.out.println("Action completed.");
                break;
            }
            else if( i == Dictionary.WordArr.size()-1) {
                Dictionary.WordArr.add( i+1, w);
                System.out.println("Action completed.");
                break;
            }
        }
    }

    //Hàm sửa dữ liệu (commandLine V2)
    public static void setWord() {
        System.out.print("Input a english word: ");
        Scanner scn = new Scanner(System.in);
        String wordTargetSetting = scn.nextLine();
        wordTargetSetting = wordTargetSetting.toLowerCase();

        int index = binarySearch( Dictionary.WordArr, wordTargetSetting);
        if( index == -1) {
            System.out.println( "Sorry! My dictionary do not have this word!");
        }
        else {
            System.out.print("Input the meaning: ");
            String wordExplainSetting = scn.nextLine();
            Dictionary.WordArr.get(index).word_target = wordTargetSetting;
            Dictionary.WordArr.get(index).word_explain = wordExplainSetting;
            System.out.println("Action completed.");
        }

    }

    //Hàm xóa dữ liệu ( commandLine V2)
    public static void deleteWord() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input a english word you want to delete: ");
        String wordDelete = scn.nextLine();
        wordDelete = wordDelete.toLowerCase();

        int index = binarySearch( Dictionary.WordArr, wordDelete);
        if( index == -1) {
            System.out.println("Sorry! My dictionary do not have this word" + wordDelete);
        }
        else {
            Dictionary.WordArr.remove(index);
            System.out.println("Action completed.");
        }
    }

    //Hàm search từ (CommandLine V2)
    public static void searchWord() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input a string to search: ");
        String wordSearching = scn.nextLine();
        wordSearching = wordSearching.toLowerCase();

        for( int i=0; i<Dictionary.WordArr.size(); i++)  {
            if( Dictionary.WordArr.get(i).word_target.length() < wordSearching.length()) {
                continue;
            }
            else if( Dictionary.WordArr.get(i).word_target.substring(0, wordSearching.length()).equals(wordSearching)) {
                System.out.println( Dictionary.WordArr.get(i).word_target);
            }
        }

    }

    //Hàm xuất dữ liệu từ điển hiện tại ra file ( CommandLine V2)
    public static void dictionaryExportToFile() {
        File dic = new File("./File/Dictionary2.txt");
        try(PrintWriter pw = new PrintWriter(dic)) {
            for( int i=0; i<Dictionary.WordArr.size(); i++) {
                pw.println( Dictionary.WordArr.get(i).word_target + "\t" + Dictionary.WordArr.get(i).word_explain);
            }
        }
        catch (Exception e) {

        }
    }
}


