/* ������ � ������� n ����� �����. �� ������� ������� ������ � �������� �����.*/

package chapter1.task2;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers: ");
        int n = scanner.nextInt(); // ��������� �����
        int[] allNumbers = new int[n]; // ������� ������ �������� n


        for (int i = 0; i < allNumbers.length; i++) {
            allNumbers[i] = scanner.nextInt(); // �������� ��� ��������� ����� � ������
        }

        int[] masOdd = new int[n];
        int[] masEven = new int[n]; //������� ������� ��� ������ � ����� �����

        int oddIndex = 0;
        int evenIndex = 0; //������� �������� �������� ��������

        for (int i = 0; i < n; i++) {
            if (allNumbers[i] % 2 == 0) {
                masEven[evenIndex] = allNumbers[i];
                evenIndex++;
            } else {
                masOdd[oddIndex] = allNumbers[i];
                oddIndex++;
            }
        }
            System.out.println("Even numbers: " + Arrays.toString(masEven));
            System.out.println("Odd numbers: " + Arrays.toString(masOdd));
        }
}






