/**
 * 5. Текст шифруется по следующему правилу: из исходного текста выбирается 1, 4, 7, 10-й и т.д.(до конца текста) символы,
 * затем 2, 5, 8, 11-й и т.д. (до конца текста) символы, затем 3, 6, 9, 12-й и т.д. Зашифровать заданный текст.
 */
package chapter8.variantC.task5;

public class Main {

    public static void main(String[] args) {
        String text = "Leonardo da Vinci";

        System.out.println(getEncryptedText(text));
    }

    public static String getEncryptedText(String text) {
        StringBuilder encryptedText = new StringBuilder();
        char[] chars = text.toCharArray();
        appendEncryptedPartFrom(0, chars, encryptedText);
        appendEncryptedPartFrom(1, chars, encryptedText);
        appendEncryptedPartFrom(2, chars, encryptedText);
        return encryptedText.toString();
    }

    private static void appendEncryptedPartFrom(int from, char[] chars, StringBuilder stringBuilder) {
        for (int i = from; i < chars.length; i = i + 3) {
            stringBuilder.append(chars[i]);
        }
    }
}
