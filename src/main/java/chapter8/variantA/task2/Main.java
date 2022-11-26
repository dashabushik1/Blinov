/**
 * 2. В тексте каждую букву заменить ее порядковым номером в алфавите. При выводе в одной строке печатать текст
 * с двумя пробелами между буквами, в следующей строке внизу под каждой буквой печатать ее номер.
 */
package chapter8.variantA.task2;

public class Main {

    public static void main(String[] args) {
        String text = "Cinema is an integral part of the social life of people." +
                "The movie combines not only stunts, special effects and scenery, but also the genuine art.";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        if ((text != null) && (text.length() > 0)) {
            char[] textChar = text.toLowerCase().toCharArray();
            for (char ch : textChar) {
                if ((ch == '.') && (ch == ',')) {
                    System.out.print("");
                } else {
                    System.out.print(ch + "  ");
                }
            }
            for (char x : textChar) {
                if (x == ' ') {
                    System.out.print("");
                } else {
                    int i = alphabet.lastIndexOf(x); //метод возвращает индекс последнего вхождения символа в алфавите
                    i += 1;
                    System.out.print(i + "  ");
                }
            }
        }
    }
}

