/**
 * 2. На базе коллекций реализовать структуру хранения чисел с поддержкой следующих операций:
 * • добавление/удаление числа;
 * • поиск числа, наиболее близкого к заданному (т.е. модуль разницы минимален).
 */
package chapter11.variantB.task2;

public class Main {

    public static void main(String[] args) {
        MyStructure myStructure = new MyStructure();
        for (int i = 0; i < 10; i++) {
            myStructure.add((int) (Math.random() * 100));
        }
        System.out.println(myStructure.findMostCloseNumber(5));
        System.out.println(myStructure);
        myStructure.remove(3);
        System.out.println(myStructure);
    }
}