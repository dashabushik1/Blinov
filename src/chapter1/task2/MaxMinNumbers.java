/* 2. ������� � ������� n ����� �����. �� ������� ������� ������������ � ����������� ��������.*/

package chapter1.task2;

import java.util.Scanner;
import java.util.Arrays;

public class MaxMinNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers: ");
        int n = scanner.nextInt();
        int[] allNumbers = new int[n];

        for (int i = 0; i < allNumbers.length; i++) {
            allNumbers[i] = scanner.nextInt();
        }

        Arrays.sort(allNumbers); //��������� ��� ��������� ����� �� ����������� � ������� ������� Arrays.sort

        System.out.println("All entered numbers after sorting: " + Arrays.toString(allNumbers)); // ������� ��������� �� �������

        int max = allNumbers[allNumbers.length - 1]; // max ������������ �����

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + allNumbers[0]);

    }
}
