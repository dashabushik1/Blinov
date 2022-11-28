/**
 * 3. После каждого слова текста, заканчивающегося заданной подстрокой, вставить указанное слово.
 */
package chapter8.variantA.task3;   // StringBuffer is synchronized, StringBuilder is not.

public class Main {

    public static void main(String[] args) {
        String text = "Cinema is an integral part of the social life of people. " +
                "The movie combines not only stunts, special effects and scenery, but also the genuine art. " +
                "Many people go to the cinemas in their free time.";
        String suffix = "al";
        String string = "**";

        String[] splittedText = text.split(" ");
        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < splittedText.length; i++) {
            if (splittedText[i].endsWith(suffix)) {
                newText.append(splittedText[i]).append(string).append(" ");
            } else {
                newText.append(splittedText[i]).append(" ");
            }
        }
        System.out.println(newText);
    }
}
