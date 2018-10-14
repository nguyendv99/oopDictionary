package DicV1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


//
public class DictionaryManagment {

    //Hàm insertFromCommandline() để nhập từ vựng và nghĩa từ bàn phím
    public static void insertFromCommandline() {

        Scanner scn = new Scanner(System.in);
        System.out.print("Nhap vao so luong tu vung ");
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

    //
    //****************************************************************//
    //
    //Hàm lấy word từ một file txt
    public static void insertFromFile() {

       File fileDic = new File( "./File/Dictionary.txt" );

       try( Scanner scn = new Scanner( fileDic)) {
           while ( scn.hasNextLine()) {

               Word word = new Word( "", ""); //Tao ra mot bien kieu Word

               String oneLine = scn.nextLine(); //Lấy nội dung một dòng text lưu vào biến oneLine

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

    //
    //***************************************************************************************//
    //

    //Hàm DictionaryLookup có chức năng tra cứu từ
    public static void DictionaryLookup( ArrayList<Word> WordArr ) {
        System.out.print( "Nhập vào từ cần tra cứu: ");
        Scanner scn = new Scanner( System.in);
        String word = scn.nextLine();

        for( int i=0; i<WordArr.size(); i++) {
            if( word.equals( Dictionary.WordArr.get(i).word_target )  ) {
                System.out.print( "Nghĩa của từ " + word + " là: ");
                System.out.println( Dictionary.WordArr.get(i).word_explain );
                break;
            }
            else if( i == WordArr.size()-1 ) {
                System.out.println( "Sorry! Từ điển của chúng tôi không có từ " + word);
            }
        }

    }

}


