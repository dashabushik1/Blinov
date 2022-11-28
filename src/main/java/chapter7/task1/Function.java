/**
 * 1. С помощью каррирования реализовать функцию сложения двух чисел, функцию проверки строки на регулярное выражение,
 * функцию разбиения строки по регулярному выражению.
 * (Каррирование — преобразование функции от многих аргументов к функции от одного аргумента.)
 */
package chapter7.task1;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Function {

    public static void main(String[] args) {
        String line = "My favourite book by Charlotte Bronte is Jane Eyre.\nJane Eyre is an autobiographical novel.";
        String regex = "\n";

        // функция сложения двух чисел с помощью функционального интерфейса BinaryOperator
        BinaryOperator<Integer> addition = (a, b) -> a + b;
        int result = addition.apply(100, 10);
        System.out.println(result);

        //функция проверки строки на регулярное выражение c помощью функционального интерфейса Consumer
        Consumer<String> stringValidation = str -> System.out.println(str.contains(regex));
        stringValidation.accept(line);

        // функция разбиения строки по регулярному выражению c помощью функционального интерфейса Consumer
        Consumer<String> stringSplitting = str -> System.out.println(Arrays.toString(str.split(regex)));
        stringSplitting.accept(line);
    }
}
