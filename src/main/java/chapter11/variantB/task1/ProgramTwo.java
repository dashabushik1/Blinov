package chapter11.variantB.task1;

import java.util.LinkedList;
import java.util.Iterator;

public class ProgramTwo { // LinkedList

    public static void main(String[] args) {
        int n = 10;
        LinkedList<Integer> linkedList = new LinkedList<>();

        fillLinkedList(n, linkedList);
        deleteEverySecondPerson(linkedList);
        System.out.println(findLastPerson(n, 2));
    }

    public static void fillLinkedList(int n, LinkedList<Integer> linkedList) { // заполнили и вывели лист
        for (int i = 0; i < n; i++) {
            linkedList.add(i + 1);
        }
    }

    public static void deleteEverySecondPerson(LinkedList<Integer> linkedList) { // моделируем удаление каждого 2 по очереди, пока не останется 1
        int count = 0;
        Iterator<Integer> iterator = linkedList.iterator();
        while (linkedList.size() > 1) {
            if (iterator.hasNext()) {
                iterator.next();
                count++;
                if (count == 2) {
                    iterator.remove();
                    count = 0;
                }
            } else {
                iterator = linkedList.iterator();
            }
        }
    }

    public static int findLastPerson(int n, int k) { // поиск последнего (n - количество, k - шаги)
        if (n > 1) {
            return (findLastPerson(n - 1, k) + k - 1) % n + 1;
        } else
            return 1;
    }
}