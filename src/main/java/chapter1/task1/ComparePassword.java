/* 4. Ввести пароль из командной строки и сравнить его со строкой-образцом.*/

package chapter1.task1;

import java.util.Scanner;

public class ComparePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password1 = scanner.next();
        String password2 = "11111";

        if (password1.equals(password2)) {
            System.out.println("Passwords match");
        } else {
            System.out.println("Passwords don't match");
        }
    }
}



