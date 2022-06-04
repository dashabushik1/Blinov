/* 2. Отобразить в окне консоли аргументы командной строки в обратном порядке. */

package chapter1.task1;

import java.util.Scanner;

public class OppositeOrder {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter numbers: ");

        for (int i = 0; true; i++) {
            StringBuffer sb = new StringBuffer(number.nextLine()); // StringBuffer() - резервирует место под 16 символов без перераспределения памяти
            sb.reverse(); // метод reverse позволяет изменить порядок слов на обратный

            System.out.println("Reverse: " + sb.toString());
        }
    }
}
