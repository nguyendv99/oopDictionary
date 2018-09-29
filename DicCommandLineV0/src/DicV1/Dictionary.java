package Assignment;
import java.util.LinkedList;

public class Dictionary {
	
	public LinkedList <Word> wordList = new LinkedList<Word> ();
	public void show () {
		System.out.print(this.wordList.size());
	}
}
