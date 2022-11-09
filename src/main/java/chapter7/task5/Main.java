/**
 * 5. Написать функциональный интерфейс с методом, который принимает две строки и возвращает тоже строку.
 * Написать реализацию такого интерфейса в виде лямбды, которая возвращает ту строку, которая длиннее.
 */
package chapter7.task5;

public class Main {

    public static void main(String[] args) {
        StringInterface s = (s1, s2) -> s1.length() > s2.length() ? s1 : s2;
        String result = s.compareStrings("pen", "pencil");
        System.out.println(result);
    }
}
