/**
 * 2. В тексте каждую букву заменить ее порядковым номером в алфавите. При выводе в одной строке печатать текст
 * с двумя пробелами между буквами, в следующей строке внизу под каждой буквой печатать ее номер.
 */
package chapter8.variantA.task2;  // Значение ASCII для алфавитов нижнего регистра составляет от 97 до 122.

public class Main {

    public static void main(String[] args) {
        String text = "Cinema is an integral part of the social life of people." +
                "The movie combines not only stunts, special effects and scenery, but also the genuine art.";

        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + " ");
        }

        System.out.println("");
        for (int i = 0; i < text.length(); i++) {
            char letter = text.toLowerCase().charAt(i);
            if (Character.isLetter(letter)) {  // a = 97, z = 122
                int position = (int) letter - 'a' + 1; // приведем символ(букву) к типу int и получим позицию в алфавите
                System.out.print(position + " ");
            }
        }
    }
}

