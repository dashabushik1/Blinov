package chapter4.task1;

import java.util.ArrayList;
import java.util.List;

public class Text {

    private String title;
    private List<Sentence> sentences = new ArrayList<>();

    public Text(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addSentence(Sentence sentence) { // метод добавляет предложения в текст
        sentences.add(sentence);
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sentence sentence : sentences) {
            sb.append(sentence.toString());
        }
        return sb.toString();
    }
}

