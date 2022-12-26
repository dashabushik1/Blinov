/**
 * 4. Задать два стека, поменять информацию местами.
 */
package chapter11.variantA.task4;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {  // todo

        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);
        stack2.push(7);

        System.out.println("---- BEFORE SWAP ----\n");
        System.out.println("s1 -> " + stack1);
        System.out.println("s2 -> " + stack2);

        swap(stack1, stack2);

        System.out.println("\n---- AFTER SWAP ----\n");
        System.out.println("s1 -> " + stack1);
        System.out.println("s2 -> " + stack2);
    }

    public static void swap(Stack<Integer> stack1, Stack<Integer> stack2) {
        swap(stack1, stack2, stack1.size(), stack2.size());
    }

    public static void swap(Stack<Integer> stack1, Stack<Integer> stack2, int lengthStack1, int lengthStack2) {
        int stack1Elem = 0;
        int stack2Elem = 0;

        if (stack1.isEmpty() && stack2.isEmpty()) {
            return;
        }

        if (!stack1.isEmpty()) {
            stack1Elem = stack1.pop(); // pop - извлечение элемента из стека
        }
        if (!stack2.isEmpty()) {
            stack2Elem = stack2.pop();
        }

        swap(stack1, stack2);

        if (stack1.size() < lengthStack2) {
            stack1.add(stack2Elem);
        }
        if (stack2.size() < lengthStack1) {
            stack2.add(stack1Elem);
        }
    }
}
