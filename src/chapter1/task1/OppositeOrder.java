/* 2. Отобразить в окне консоли аргументы командной строки в обратном по-
рядке. */

package chapter1.task1;

import java.util.Scanner;
public class OppositeOrder {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter numbers: ");

        for (int i = 0; true; i++) {
            StringBuffer sb = new StringBuffer(number.nextLine());
            sb.reverse();

            System.out.println("Reverse: " + sb.toString());
        }
    }
}
