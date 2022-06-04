/* 1. Приветствовать любого пользователя при вводе его имени через команд-
ную строку. */

package chapter1.task1;

import java.util.Scanner;

public class AnyUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello, " + name);
    }
}

