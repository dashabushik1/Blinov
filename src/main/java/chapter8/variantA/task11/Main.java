/**
 * 11. Вывести в заданном тексте все слова, расположив их в алфавитном порядке.
 */
package chapter8.variantA.task11;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String text = "Cinema is an integral part of the social life of people.\n" +
                "The movie combines not only stunts, special effects and scenery, but also the genuine art.\n" +
                "Many people go to the cinemas in their free time.";
        String[] words = text.toLowerCase().split("[\\s.,!?\\d]+");
        Arrays.sort(words);
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
