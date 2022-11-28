/**
 * 1. Проверить, является ли строка сильным паролем. Пароль считается сильным, если его длина больше либо равна 10 символам,
 * он содержит как минимум одну цифру, одну букву в верхнем и одну букву в нижнем регистре.
 * Пароль может содержать только латинские буквы и/или цифры, а также символ «_».
 */
package chapter8.variantC.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = scanner.next();

        System.out.println(validatePassword(password));
    }

    public static String validatePassword(String password) {
        String result = " ";
        if (isRequiredLength(password)) {
            result = "Password must have at least 10 characters!";
        } else if (!isHasAtLeastOneDigit(password)) {
            result = "Password must have at least one digit!";
        } else if (!isHasAtLeastOneUpperAndLowerLetter(password)) {
            result = "Password must have at least one upper and one lower letter!";
        } else if (!isHasAtLeastOneSymbol(password)) {
            result = "Password must have at least one symbol '_'!";
        } else {
            result = "The password is correct!";
        }
        return result;
    }

    public static boolean isRequiredLength(String password) {
        boolean isTrue = false;
        if (password.length() < 10) {
            isTrue = true;
        }
        return isTrue;
    }

    public static boolean isHasAtLeastOneDigit(String password) {
        int numCount = 0;
        boolean isNum = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                numCount++;
            }
            if (numCount >= 1) {
                isNum = true;
            }
        }
        return isNum;
    }

    public static boolean isHasAtLeastOneUpperAndLowerLetter(String password) {
        int lowerCount = 0;
        int upperCount = 0;
        boolean isLetter = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            }
            if ((upperCount >= 1) && (lowerCount >= 1)) {
                isLetter = true;
            }
        }
        return isLetter;
    }

    public static boolean isHasAtLeastOneSymbol(String password) {
        int symbolCount = 0;
        boolean isSymbol = false;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == '_') {
                symbolCount++;
            }
            if (symbolCount >= 1) {
                isSymbol = true;
            }
        }
        return isSymbol;
    }
}
