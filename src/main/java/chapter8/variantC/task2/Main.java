/**
 * 2. Осуществить сжатие английского текста, заменив каждую группу из двух или более рядом стоящих символов на один символ,
 * за которым следует количество его вхождений в группу. К примеру, строка hellowoooorld должна сжиматься в hel2owo4rld.
 */
package chapter8.variantC.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "Raaaadio and TV are maass meeeeeedia which keep peooople informeeed on the topical issues of the day. " +
                "Both on raaaadio and TV you can liiisten to a programme on spooorts, art, newwwws, music and weeeathhher.";

        System.out.println(textCompression(text));
    }

    private static String textCompression(String text) {
        StringBuilder result = new StringBuilder();

        // инициализация шаблона и сопоставления
        Pattern pattern = Pattern.compile("(.)\\1*");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            result.append(matcher.group(1));
            int length = matcher.group().length();
            if (length > 1) {
                result.append(length);
            }
        }
        return result.toString();
    }
}
