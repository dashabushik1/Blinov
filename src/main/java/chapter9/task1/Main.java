/**
 * 1. Создать собственный класс исключения. Предусмотреть обработку исключений, возникающих при нехватке памяти,
 * отсутствии самого файла по заданному адресу, недопустимом значении числа
 * (выходящим за пределы максимально допустимых значений) и т.д.
 */
package chapter9.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            int result = divideInt(10, 5);  // ошибка деления на ноль
            System.out.println("10 / 5 = " + result);
            divideInt(10, 0);
            System.out.println("10 / 0 = " + result);
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        }

        try {
            Integer[] array = new Integer[20000 * 20000];
            System.out.println(Arrays.toString(array));
        } catch (OutOfMemoryError e) {           // нехватка памяти
            System.out.println(e.getMessage());
        }

        try {
            File file = new File("text.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException e) {  // файл не найден
            System.out.println(e.getMessage());
        }
    }

    public static int divideInt(int a, int b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("Divisor must not be 0!");
        }
        return a / b;
    }
}

