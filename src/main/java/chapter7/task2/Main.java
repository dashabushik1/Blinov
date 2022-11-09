/**
 * 2. Определить, являются ли слова анаграммами, т.е. можно ли из одного слова составить другое перестановкой букв.
 */
package chapter7.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputWord = new Scanner(System.in);

        // функция проверки двух слов на анаграммы с помощью функционального интерфейса Anagram
        Anagram anagram = ((firstInputWord, secondInputWord) -> {
            char[] firstWordChars = firstInputWord.toLowerCase().toCharArray();
            char[] secondWordChars = secondInputWord.toLowerCase().toCharArray();

            Arrays.sort(firstWordChars);
            Arrays.sort(secondWordChars);

            if (String.valueOf(firstWordChars)
                    .trim()
                    .contentEquals(String.valueOf(secondWordChars).trim())) {
                System.out.println("Words '" + firstInputWord + "' and '" + secondInputWord + "' are anagrams.");
            } else {
                System.out.println("Words '" + firstInputWord + "' and '" + secondInputWord + "' are not anagrams.");
            }
        });

        System.out.println("Enter an input first line of strings");
        String firstWord = inputWord.nextLine();
        System.out.println("Enter an input second line of strings");
        String secondWord = inputWord.nextLine();

        anagram.checkForAnagram(firstWord, secondWord);
        inputWord.close();
    }
}

