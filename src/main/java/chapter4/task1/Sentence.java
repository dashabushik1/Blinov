package chapter4.task1;

import java.util.ArrayList;
import java.util.List;

class Sentence {

    List<Word> sentence = new ArrayList<>();

    public List<Word> addWord(Word word) {
        sentence.add(word);
        return sentence;
    }

    public List<Word> getSentence() {
        return sentence;
    }
}
