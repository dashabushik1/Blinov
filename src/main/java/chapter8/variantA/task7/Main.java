/**
 * 7. В стихотворении найти количество слов, начинающихся и заканчивающихся гласной буквой.
 */
package chapter8.variantA.task7;

public class Main {

    public static void main(String[] args) {
        String verse = "Twinkle, twinkle, little star, \n" +
                "How I wonder what you are. \n" +
                "Up above the world so high, \n" +
                "Like a diamond in the sky.";
        int count = 0;

        if ((verse != null) && (verse.length() > 0)) {
            String[] words = verse.toLowerCase().split("[\\s.,?!\\d]+");
            for (String word : words) {
                if ((word.startsWith("a")) || (word.startsWith("e")) || (word.startsWith("i"))
                        || (word.startsWith("o")) || (word.startsWith("u")) || (word.startsWith("y"))) {
                    count++;
                }
            }
            System.out.println(count);
        } else {
            System.out.println("Verse is null.");
        }
    }
}
