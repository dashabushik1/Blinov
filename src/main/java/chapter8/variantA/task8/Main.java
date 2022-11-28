/**
 * 8. Напечатать слова текста, у которых первая и последняя буквы совпадают.
 */
package chapter8.variantA.task8;

public class Main {

    public static void main(String[] args) {
        String text = "area, tract, space, house, estate, stuff, lot, scads";

        String[] words = text.toLowerCase().split("[\\s.,!?\\d]+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                sb.append(word).append("\n");
            }
        }
        System.out.println(sb);
    }
}
