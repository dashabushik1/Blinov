/* 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку. */

package chapter1.task1;
public class RandomNumber {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        for (int i : a) {
            System.out.println(i);
            System.out.print(i);
        }
    }
}
