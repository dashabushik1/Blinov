/* 2. ���������� � ���� ������� ��������� ��������� ������ � �������� ��-
�����. */

package chapter1.task1;

import java.util.Scanner;

public class OppositeOrder {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        for (int i = 0; true; i++) {
            StringBuffer sb = new StringBuffer(number.nextLine());
            sb.reverse();
            System.out.println("Reverse: " + sb.toString());
        }
    }
}
