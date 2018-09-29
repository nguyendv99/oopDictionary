package Assignment;
import java.util.Scanner;

public class DictionaryManagement {
	public static void insertFromCommandline(Dictionary dic) {
		Scanner sc = new Scanner(System.in);
		Word word = new Word("","");
		System.out.print("Input word target:\t");
		word.setWord_target(sc.nextLine());
		System.out.print("Input word explain:\t");
		word.setWord_explain(sc.nextLine());
		dic.wordList.add(word);
	}
}
