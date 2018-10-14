package DicV1;

import java.util.ArrayList;

public class DictionaryCommandline {
    public static void ShowAllWord( ArrayList<Word> WordArr) {
        int sizeOfArr = WordArr.size();
        System.out.println( "No       | English               | Vietnamese");
        for( int i=0; i<sizeOfArr; i++) {
            System.out.printf( "%-9s", i+1 );
            System.out.print( "| " );
            System.out.printf( "%-22s", WordArr.get(i).word_target );
            System.out.println( "| " + WordArr.get(i).word_explain );
        }
    }


    public static void main( String[] args) {
      //  DictionaryManagment.insertFromCommandline();
      //  ShowAllWord( Dictionary.WordArr);
        DictionaryManagment.insertFromFile();

        ShowAllWord( Dictionary.WordArr );

        DictionaryManagment.DictionaryLookup( Dictionary.WordArr );
    }

}
