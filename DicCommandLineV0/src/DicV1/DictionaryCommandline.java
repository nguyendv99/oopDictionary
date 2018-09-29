package Assignment;
import java.util.LinkedList;
import java.util.Scanner;


public class DictionaryCommandline {
	public static void showAllWords(LinkedList<Word> wordList) {
		System.out.print("N0\t|English\t\t|Vietnamese\n");
		int sizeList = wordList.size();
		for (int i = 0; i < sizeList; i++) {
			System.out.print(i+1 + "\t|");
			System.out.print(wordList.get(i).getWord_target() + "\t\t\t|");
			System.out.print(wordList.get(i).getWord_explain()+ "\n");
		}
	}
	public static void dictionaryBasic() {
		Dictionary dic = new Dictionary();
		Scanner sc = new Scanner(System.in);
		int choice = 3;
		do {
			System.out.println("1. insertFromCommandline()");
			System.out.println("2. showAllWords()");
			choice = sc.nextInt();
			if (choice == 1) {
				DictionaryManagement.insertFromCommandline(dic);
			} else {
				showAllWords(dic.wordList);
			}
			System.out.println("------------------------------------------");
		} while (choice == 1 || choice == 2);
		sc.close();
	}
}
