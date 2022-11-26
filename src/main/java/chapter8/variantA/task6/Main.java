/**
 * 6. Найти, каких букв, гласных или согласных, больше в каждом предложении текста.
 */
package chapter8.variantA.task6;

public class Main {

    public static void main(String[] args) {
        String text = "Cinema is an integral part of the social life of people." +
                "The movie combines not only stunts, special effects and scenery, but also the genuine art." +
                "Many people go to the cinemas in their free time.";
        String vowels = "aeiouy"; // гласные
        int count = 0; // все буквы
        int countVowels = 0; // счетчик гласных

        if ((text != null) && (text.length() > 0)) {
            char[] charArray = text.toLowerCase().toCharArray();
            for (char x : charArray) {
                if (Character.isLetter(x)) { // считаем все буквы в тексте
                    count++;
                }
                if (vowels.indexOf(x) != -1) { // если буква совпадает с одной из гласных - записываем в countVowels
                    countVowels++;
                }
            }
            System.out.println("Vowels = " + countVowels + "\nConstants = " + (count - countVowels));
        } else {
            System.out.println("Text is null.");
        }
    }
}
