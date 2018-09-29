package Assignment;
import java.util.LinkedList;
import java.util.Scanner;

public class DictionaryCommandline {
	public void showAllWords(LinkedList<Word> wordList) {
		System.out.print("N0\t|English\t\t|Vietnamese");
		int sizeList = wordList.size();
		for (int i = 0; i < sizeList; i++) {
			System.out.print(i+1 + "\t|");
			System.out.print(wordList.get(i).getWord_target() + "\t\t|");
			System.out.print(wordList.get(i).getWord_explain()+ "\n");
		}
	}
	public void dictionaryBasic() {
		DictionaryManagement dM = new DictionaryManagement();
		Dictionary dic = new Dictionary();
		System.out.println("1. insertFromCommandline()");
		System.out.println("2. showAllWords()");
		Scanner sc = new Scanner(System.in);
		int tmp = sc.nextInt();
		sc.close();
		if (tmp == 1) {
			dM.insertFromCommandline();	
		} else {
			showAllWords(dic.wordList);
		}
	}
}
