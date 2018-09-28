package DicV1;

import DicV1.Word;

import java.util.Scanner;

//
public class DictionaryManagment {

    public  static Dictionary dic = new Dictionary();

    //Hàm insertFromCommandline() để nhập từ vựng và nghĩa từ bàn phím
    public static void insertFromCommandline( ) {
        Scanner scn = new Scanner( System.in );
        System.out.print( "Nhap vao so luong tu vung ");
        int NumOfWord = scn.nextInt();
        scn.nextLine();
        for( int i=0; i<NumOfWord; i++ ) {
            Word w = new Word("", "");
          //  System.out.print("Nhap target thu " + i + ": ");
            w.word_target = scn.nextLine();

          //  System.out.print("Nhap explain thu " + i + ": ");
            w.word_explain = scn.nextLine();
            dic.WordArr.add( w );
        }

    }

    /*
    public static void main( String[] args) {
        insertFromCommandline();
       // Dictionary dic = new Dictionary();
        for( int i=0; i<dic.WordArr.size(); i++)
        {
            System.out.println( dic.WordArr.get( i ).word_target + " : " + dic.WordArr.get( i ).word_explain);
        }

    }
    ************/
}
