/**
 * 1. В каждом слове текста k-ю букву заменить заданным символом. Если k больше длины слова, корректировку не выполнять.
 */
package chapter8.variantA.task1;

public class Main {

    public static void main(String[] args) {
        String text = "Cinema is an integral part of the social life of people. " +
                "The movie combines not only stunts, special effects and scenery, but also the genuine art. " +
                "Many people go to the cinemas in their free time.";
        int k = 5;
        String symbol = "*";
        String[] words = text.split("[\\s.,?!\\d]+"); // \\d - 0-9, \\s - переносы

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= k) {
                words[i] = words[i].substring(0, k - 1) + symbol + words[i].substring(k);
            }
        }
        System.out.println(String.join(" ", words));
    }
}