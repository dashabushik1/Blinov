/**
 * 3. Осуществить форматирование заданного текста с выравниванием по левому краю.
 * Программа должна разбивать текст на строки с длиной, не превосходящей заданного количества символов.
 * Если очередное слово не помещается в текущей строке, его необходимо переносить на следующую.
 */
package chapter8.variantC.task3;

public class Main {

    public static void main(String[] args) {
        String text = "The most conspicuous of the British tourists who have attempted a comparison, " +
                "seem to regard our northern and eastern seaboard, comparatively speaking, " +
                "as all of America, at least, as all of the United States, worthy consideration.";

        System.out.println(getJustifiedText(text, 30));
    }

    public static String getJustifiedText(String text, int maxChars) {
        String[] words = text.split(" "); // 35
        StringBuilder justifiedText = new StringBuilder();
        int currentChars = 0;
        for (String word : words) {
            currentChars += word.length() + 1;
            if (currentChars > maxChars) {
                justifiedText.append("\n");
                currentChars = word.length() + 1;
            }
            justifiedText.append(word).append(" ");
        }
        return justifiedText.toString().trim();
    }
}
