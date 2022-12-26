/**
 * 2. Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.
 */
package chapter11.variantA.task2;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();  // Stack - структура данных, которая работает по принципу LIFO
        int reverse = 0;                  // (элементы, которые помещаются в стек последними, выводятся первыми - и наоборот)
        int i = 1;

        while (number != 0) {
            stack.push(number % 10); // вложение элемента в стек
            number = number / 10;
        }

        while (!stack.isEmpty()) {
            reverse = reverse + (stack.peek() * i);
            stack.pop(); // удаление элемента из стека
            i = i * 10;
        }
        System.out.println(reverse);
    }
}
