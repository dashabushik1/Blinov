package chapter4.task1;

import java.util.*;

class Sentence {

    private List<Word> words = new ArrayList<>();  // Word - тип, который хранится в списке

    public Sentence addWord(Word word) { // метод добавляет слова в предложения
        words.add(word);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Word word : words) {
            sb.append(word);
            sb.append(" ");
        }
        return sb.toString();
    }
}

