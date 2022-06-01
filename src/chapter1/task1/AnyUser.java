/* 1. Приветствовать любого пользователя при вводе его имени через команд-
ную строку. */

package chapter1.task1;

import java.util.Scanner;

public class AnyUser {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        for (int i = 0; true ; i++) {
            System.out.println("Привет, " + name.nextLine());
        }
    }
}
