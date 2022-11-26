/**
 * 8. Напечатать слова текста, у которых первая и последняя буквы совпадают.
 */
package chapter8.variantA.task8;

public class Main {

    public static void main(String[] args) {
        String text = "area, tract, space, house, estate, stuff, lot, scads";

        if ((text != null) && (text.length() > 0)) {
            String[] words = text.toLowerCase().split("[\\s.,!?\\d]+");
            for (int i = 0; i < words.length; i++) {
                char[] charArray = words[i].toCharArray();
                if (charArray[0] == charArray[charArray.length - 1]) {
                    System.out.println(words[i]);
                }
            }
        } else {
            System.out.println("String is null.");
        }
    }
}
