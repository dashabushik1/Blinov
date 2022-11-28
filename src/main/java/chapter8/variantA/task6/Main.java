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
        int countVowels = 0; // счетчик гласных
        int countConsonant = 0; // счетчик согласных

        for (int i = 0; i < text.length(); i++) {
            char letter = text.toLowerCase().charAt(i);
            if (Character.isLetter(letter)) {
                if (vowels.indexOf(letter) >= 0) { // если буква совпадает с одной из гласных - записываем в countVowels
                    countVowels++;
                } else {
                    countConsonant++;
                }
            }
        }
        System.out.println("Vowels = " + countVowels + "\nNot vowels = " + countConsonant);
    }
}