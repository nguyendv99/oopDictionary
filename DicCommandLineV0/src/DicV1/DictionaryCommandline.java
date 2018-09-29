package Assignment;
import java.util.LinkedList;

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
}
