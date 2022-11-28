/**
 * 1. Проверить, является ли строка сильным паролем. Пароль считается сильным, если его длина больше либо равна 10 символам,
 * он содержит как минимум одну цифру, одну букву в верхнем и одну букву в нижнем регистре.
 * Пароль может содержать только латинские буквы и/или цифры, а также символ «_».
 */
package chapter8.variantC.task1;

import java.util.Scanner;  //1As_drT23A

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = scanner.next();

        System.out.println(isStrong(password));
    }

    public static boolean isStrong(String password) {
        return password.matches("(?=.*[A-Z])(?=.*[a-z]).(?=.*\\d)(?=\\S+$)(?=.*_).{10,}");
    }
}
