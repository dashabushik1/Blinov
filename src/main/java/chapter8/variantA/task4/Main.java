/**
 * 4. Из текста удалить все символы, кроме пробелов, не являющиеся буквами. Между
 * последовательностями подряд идущих букв оставить хотя бы один пробел.
 */
package chapter8.variantA.task4;

public class Main {

    public static void main(String[] args) {
        String text = "Cinema is %an integral part *of the social life of people!" +
                "The )movie combines not only ^stunts, special effects and scenery, but also the genuine art!" +
                "Many people( go to the cinemas in !their free time.";

        if ((text != null) && (text.length() > 0)) {
            char[] charArray = text.toLowerCase().toCharArray();
            for (char x : charArray) {
                if (Character.isLetter(x)) {
                    System.out.print(x + " ");
                }
            }
        } else {
            System.out.println("Text is null.");
        }
    }
}