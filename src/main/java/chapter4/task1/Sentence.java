package chapter4.task1;

import java.util.ArrayList;
import java.util.List;

class Sentence {

    private List<Word> words = new ArrayList<>();

    public Sentence addWord(Word word) {
        words.add(word);
        return this;
    }

    public List<Word> getWords() {
        return words;
    }
}
