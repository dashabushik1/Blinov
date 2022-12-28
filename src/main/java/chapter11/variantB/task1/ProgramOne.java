/**
 * 1. В кругу стоят N человек, пронумерованных от 1 до N. При ведении счета по кругу вычеркивается каждый второй человек,
 * пока не останется один. Составить две программы, моделирующие процесс.
 * Одна из программ должна использовать класс ArrayList, а вторая — LinkedList.
 */
package chapter11.variantB.task1;

import java.util.ArrayList;
import java.util.Iterator;

public class ProgramOne { // ArrayList

    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> arrayList = new ArrayList<>();

        fillArrayList(n, arrayList);
        deleteEverySecondPerson(arrayList);
        System.out.println(findLastPerson(n, 2));
    }

    public static void fillArrayList(int n, ArrayList<Integer> arrayList) { // заполнили и вывели лист
        for (int i = 0; i < n; i++) {
            arrayList.add(i + 1);
        }
    }

    public static void deleteEverySecondPerson(ArrayList<Integer> arrayList) { // моделируем удаление каждого 2го по очереди, пока не останется 1
        int count = 0;
        Iterator<Integer> iterator = arrayList.iterator();
        while (arrayList.size() > 1) {
            if (iterator.hasNext()) {
                iterator.next();
                count++;
                if (count == 2) {
                    iterator.remove();
                    count = 0;
                }
            } else {
                iterator = arrayList.iterator();
            }
        }
    }

    public static int findLastPerson(int n, int k) { // поиск последнего (n - количество, k - шаги)
        if (n > 1) {
            return (findLastPerson(n - 1, k) + k - 1) % n + 1; // рекурсия(метод вызывает сам себя)
        } else {
            return 1;
        }
    }
}
