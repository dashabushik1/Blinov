/**
 * 10. В заданном тексте найти сумму всех встречающихся цифр.
 */
package chapter8.variantA.task10;

public class Main {

    public static void main(String[] args) {
        String text = "Primary school is divided into infant school (pupils from 5 to 7 years old) " +
                "and junior school (from 8 to 11 years old). In some areas there are middle schools " +
                "instead of junior schools, which take pupils from 9 to 12 years old. Primary schools have from 50-200 pupils.";

        if ((text != null) && (text.length() > 0)) {
            char[] charArray = text.toLowerCase().toCharArray();
            int sum = 0;
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] >= '0' && charArray[i] <= '9') {
                    sum += Integer.parseInt(String.valueOf(charArray[i]));
                }
            }
            System.out.println(sum);
        }
    }
}