/**
 * 4. Задать два стека, поменять информацию местами.
 */
package chapter11.variantA.task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stackOne = new Stack<>();
        stackOne.push(1);
        stackOne.push(2);
        stackOne.push(3);

        Stack<Integer> stackTwo = new Stack<>();
        stackTwo.push(4);
        stackTwo.push(5);
        stackTwo.push(6);
        stackTwo.push(7);

        System.out.println("---- BEFORE SWAP ----\n");
        System.out.println("stack 1 -> " + stackOne);
        System.out.println("stack 2 -> " + stackTwo);

        Iterator<Integer> iteratorForFirstStack = stackOne.iterator();
        Iterator<Integer> iteratorForSecondStack = stackTwo.iterator();

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        while (iteratorForFirstStack.hasNext()) {
            list.add(iteratorForFirstStack.next());
        }

        while (iteratorForSecondStack.hasNext()) {
            list2.add(iteratorForSecondStack.next());
        }

        stackOne.clear();

        for (Integer integer : list2) {
            stackOne.push(integer);
        }

        stackTwo.clear();

        for (Integer integer : list) {
            stackTwo.push(integer);
        }

        System.out.println("\n---- AFTER SWAP ----\n");
        System.out.println("stack 1 -> " + stackOne);
        System.out.println("stack 2 -> " + stackTwo);

    }
}
