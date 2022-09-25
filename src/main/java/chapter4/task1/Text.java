package chapter4.task1;

import java.util.ArrayList;
import java.util.List;

public class Text {

    private String textTitle;
    private List<Sentence> sentences = new ArrayList<>();

    public Text(String textTitle) {
        this.textTitle = textTitle;
    }

    public String getTextTitle() {
        return textTitle;
    }

    public List<Sentence> addSentence(Sentence sentence) {
        sentences.add(sentence);
        return sentences;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        return String.format("Text{text=%s, header='%s'}", sentences, textTitle);
    }
}

