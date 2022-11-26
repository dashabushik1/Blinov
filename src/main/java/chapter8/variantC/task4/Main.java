/**
 * 4. Изменить программу из предыдущего примера так, чтобы она осуществляла форматирование
 * с выравниванием по обоим краям. Для этого добавить дополнительные пробелы между словами.
 */
package chapter8.variantC.task4;

public class Main {

    public static void main(String[] args) {
        String text = "The most conspicuous of the British tourists who have attempted a comparison, " +
                "seem to regard our northern and eastern seaboard, comparatively speaking, " +
                "as all of America, at least, as all of the United States, worthy consideration.";

        System.out.println(getFormattedText(getJustifiedText(text, 30)));
    }

    public static String getJustifiedText(String text, int maxChars) {
        String[] words = text.split(" ");
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

    public static String getFormattedText(String text) {
        StringBuilder result = new StringBuilder();
        String[] lines = text.split("\n");
        for (int i = 0; i < lines.length; i++) {
            lines[i] = lines[i].trim();
        }
        int max = getMaxSizedLine(lines);
        for (String line : lines) {
            if (line.length() < max) {
                String[] words = line.split(" ");
                if (words.length != 1) {
                    while (getCountOfLineLength(words) != max) {
                        for (int i = 0; i < words.length - 1 && getCountOfLineLength(words) != max; ++i) {
                            words[i] += " ";
                        }
                    }
                }
                for (String word : words) {
                    result.append(word);
                }
                result.append("\n");
            } else {
                result.append(line).append('\n');
            }
        }
        return result.toString().trim();
    }

    private static int getCountOfLineLength(String[] words) {
        int result = 0;
        for (String word : words) {
            result += word.length();
        }
        return result;
    }

    private static int getMaxSizedLine(String[] lines) {
        int max = -1;
        for (String line : lines) {
            max = Math.max(max, line.length());
        }
        return max;
    }
}


