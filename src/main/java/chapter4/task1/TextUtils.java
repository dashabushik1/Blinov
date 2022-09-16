package chapter4.task1;

public class TextUtils {

    public static void printHeader(Text text){
        System.out.println(text.getHeader());
    }

    public static void printSentence(Sentence sentence){
        String line = "";
        for(Word word : sentence.getSentence()){
            line +=  word.getWord() + " ";
        }
        System.out.println(line);
    }

    public static void printText(Text text){
        for(Sentence sentence: text.getText()) {
            printSentence(sentence);
        }
    }
}
