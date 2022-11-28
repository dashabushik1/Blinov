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

        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.toLowerCase().charAt(i);
            if (Character.isLetter(letter)) {
                newText.append(letter).append(" ");
            }
        }
        System.out.println(newText);
    }
}