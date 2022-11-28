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

        String[] words = verse.toLowerCase().split("[\\s.,?!\\d]+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if ((isVowel(words[i].charAt(0)) &&
                    (isVowel(words[i].charAt(words[i].length() - 1))))) {
                sb.append(words[i]).append(" ");
                count++;
            }
        }
        System.out.println(sb + " " + "\nCount: " + count);
    }

    public static boolean isVowel(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                return true;
            default:
                return false;

        }
    }
}
