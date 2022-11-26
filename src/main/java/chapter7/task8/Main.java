/**
 * 8. Вывести количество вхождений заданного слова в тексте соответственно из файла
 * в виде [слово1-2, слово2-3, слово3-0].
 */
package chapter7.task8;

public class Main {

    public static void main(String[] args) {

        String text = "London has many beautiful squares. One of the central square of the city is Trafalgar Square. " +
                "St Paul’s Cathedral is the biggest English church. Another famous church is Westminster Abbey. " +
                "London is also famous for its beautiful parks: Hyde Park is one of the most famous park in the world.";
        int count = 1;

        String[] words = text.toLowerCase().split(" ");
        int wordsLength = words.length;
        for (int i = 0; i < wordsLength; i++) {
            String word = words[i];
            for (int j = i + 1; j < wordsLength - 1; j++) {
                if (word.equals(words[j])) {
                    count++;
                    for (int k = j; k < wordsLength - 1; k++) {
                        words[k] = words[k + 1];
                    }
                    wordsLength--;
                    j--;
                }
            }
            System.out.println(word + " - " + count);
            count = 0;
        }
    }
}
