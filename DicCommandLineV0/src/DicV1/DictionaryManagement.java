package Assignment;
import java.util.Scanner;

public class DictionaryManagement {
	public void insertFromCommandline( ) {
		Scanner sc = new Scanner(System.in);
		Dictionary dic = new Dictionary();
		Word word = new Word("","");
		word.setWord_target(sc.nextLine());
		word.setWord_explain(sc.nextLine());
		dic.wordList.add(word);
		sc.close();
	}
}
