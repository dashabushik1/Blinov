/* 3. Вывести заданное количество случайных чисел с переходом и без перехода
на новую строку. */

package chapter1.task1;


public class RandomNumber {
    public static void main(String[] args) {
        int a = 0;
        int b = 100;
        for (int i = 0; i < 10; i++) {
            int random_number = a + (int) (Math.random() * b);
            System.out.println("Random number: " + random_number + ";");
//            System.out.print(" Random Number: " + random_number + ";");
        }
    }
}
