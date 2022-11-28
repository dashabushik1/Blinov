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

        if (!isRequiredLength(password)) {
            System.out.println("Password must have at least 10 characters.");
        }

        if (!isHasAtLeastOneDigit(password)) {
            System.out.println("Password is true.");
        }
    }

    public static boolean isRequiredLength(String password) {
        if (password.length() >= 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isHasAtLeastOneDigit(String password) {
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                numCount++;
            } else {
                return false;
            }
        }
        return ((numCount >= 1));
    }

    public static boolean isHasAtLeastOneUpperAndLowerLetter(String password) {
        int lowerCount = 0;
        int upperCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            }
        }
        return((upperCount >= 1) && (lowerCount >= 1));
    }

    public static boolean isHasAtLeastOneSymbol(String password) {
        int symbolCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == '_') {
                symbolCount++;
            }
        }
        return (symbolCount >= 1);
    }
}
