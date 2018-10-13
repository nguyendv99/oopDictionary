package DicV2;

public class Word {
    public String word_target;
    public String word_explain;

    public Word( String target, String explain) {
        this.word_explain = explain;
        this.word_target = target;
    }


    //Các phương thức get/set

    public String getWord_target() {
        return word_target;
    }

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    public String getWord_explain() {
        return word_explain;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }
}
