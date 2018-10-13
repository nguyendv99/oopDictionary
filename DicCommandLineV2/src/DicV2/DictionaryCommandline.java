package DicV2;

import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryCommandline {
    public static void ShowAllWord( ArrayList<Word> WordArr) {
        int sizeOfArr = WordArr.size();
        System.out.println( "No       | English               | Vietnamese");
        for( int i=0; i<sizeOfArr; i++) {
            System.out.printf( "%-9s", i+1 );
            System.out.print( "| " );
            System.out.printf( "%-27s", WordArr.get(i).word_target );
            System.out.println( "| " + WordArr.get(i).word_explain );
        }
    }


    public static void main( String[] args) {
      //  DictionaryManagment.insertFromCommandline();
      //  ShowAllWord( Dictionary.WordArr);

        DictionaryManagment.insertFromFile();
        ShowAllWord( Dictionary.WordArr );

        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("1. Look up a word.");
            System.out.println("2. Insert a word.");
            System.out.println("3. Set a word.");
            System.out.println("4. Delete a word.");
            System.out.println("5. Search a word.");
            System.out.println("6. Show all word.");
            System.out.println("0. Sava data and exit.");

            int selection = scn.nextInt();
            if( selection == 1) {
                DictionaryManagment.DictionaryLookup( Dictionary.WordArr);
            }
            else if( selection == 2) {
                DictionaryManagment.insertWord();
            }
            else if( selection == 3) {
                DictionaryManagment.setWord();
            }
            else if( selection == 4) {
                DictionaryManagment.deleteWord();
            }
            else if( selection == 5) {
                DictionaryManagment.searchWord();
            }
            else if( selection == 6){
                ShowAllWord( Dictionary.WordArr);
            }
            else if( selection == 0) {
                DictionaryManagment.dictionaryExportToFile();
                break;
            }
        }

    }

}
