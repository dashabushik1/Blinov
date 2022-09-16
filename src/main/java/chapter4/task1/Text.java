package chapter4.task1;

import java.util.ArrayList;
import java.util.List;

public class Text {

    List<Sentence> text = new ArrayList<>();
    private String header;

    public Text(String header) {
        this.header = header;
    }

    public List<Sentence> addSentence(Sentence sentence) {
        text.add(sentence);
        return text;
    }

    public List<Sentence> getText() {
        return text;
    }

    public void setText(List<Sentence> text) {
        this.text = text;
    }

    public String getHeader() {
        return header;
    }

    @Override
    public String toString() {
        return "Text{" +
                "text=" + text +
                ", header='" + header + '\'' +
                '}';
    }
}

