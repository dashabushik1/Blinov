/**
 * 8. Вывести количество вхождений заданного слова в тексте соответственно из файла
 * в виде [слово1-2, слово2-3, слово3-0].
 */
package chapter7.task8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String text = "London has many beautiful squares. One of the central square of the city is Trafalgar Square. " +
                "St Paul’s Cathedral is the biggest English church. Another famous church is Westminster Abbey. " +
                "London is also famous for its beautiful parks: Hyde Park is one of the most famous park in the world.";

        String wordOne = "London";
        String wordTwo = "Square";
        String wordThree = "Church";
        String wordFour = "Park";

        System.out.println("Word '" + wordOne + "' - " + findWords(text, wordOne));
        System.out.println("Word '" + wordTwo + "' - " + findWords(text, wordTwo));
        System.out.println("Word '" + wordThree + "' - " + findWords(text, wordThree));
        System.out.println("Word '" + wordFour + "' - " + findWords(text, wordFour));
    }

    private static long findWords(String text, String w) {
        return Arrays.stream(text.toLowerCase().split("\\s")) // почему long, не int? высветилось авто
                .filter(word -> word.contains(w.toLowerCase()))
                .count();
    }
}
