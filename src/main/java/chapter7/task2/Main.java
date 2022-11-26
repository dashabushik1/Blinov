/**
 * 2. Определить, являются ли слова анаграммами, т.е. можно ли из одного слова составить другое перестановкой букв.
 */
package chapter7.task2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // функция проверки двух слов на анаграммы с помощью функционального интерфейса Anagram
        Anagram anagram = ((firstWord, secondWord) -> {
            if (firstWord.length() != secondWord.length()) {
                return false;
            }

            char[] firstWordChars = firstWord.toLowerCase().toCharArray();
            char[] secondWordChars = secondWord.toLowerCase().toCharArray();

            Arrays.sort(firstWordChars);
            Arrays.sort(secondWordChars);

            return Arrays.equals(firstWordChars, secondWordChars);
        });

        boolean result = anagram.checkForAnagram("thing", "night");
        System.out.println(result);
    }
}

