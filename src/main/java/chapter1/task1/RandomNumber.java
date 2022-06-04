/* 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку. */

package chapter1.task1;

public class RandomNumber {
    public static void main(String[] args) {
        int a = 0;
        int b = 100;

        System.out.print("Random numbers: ");
        for (int i = 0; i < 10; i++) {
            int number = (a + (int) (Math.random() * b));
            System.out.print(number + " ");
        }

        System.out.println(" ");
        System.out.print("Random numbers: ");
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            int number = (a + (int) (Math.random() * b));
            System.out.println(number + " ");
        }
    }
}
