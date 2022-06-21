/**
 * 4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
 */
package chapter1.task1;

public class ComparePassword {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Password not found.");
            return;
        }

        String stringSample = "11111";
        String stringInput = args[0];

        if (stringInput.equals(stringSample)) {
            System.out.println("Passwords match");
        } else {
            System.out.println("Passwords don't match");
        }
    }
}




