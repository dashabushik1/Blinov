/**
 * 5. Ввести целые числа как аргументы командной строки, подсчитать их сум-
 * мы и произведения. Вывести результат на консоль.
 */
package chapter1.variantA;

public class SumMultiply {

    public static void main(String[] args) {

        if (args.length < 2) {  // проверка аргументов
            return;
        }

        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        int sum = firstNumber + secondNumber;
        int multiply = firstNumber * secondNumber;

        System.out.println("Sum: " + sum);
        System.out.println("Multiply: " + multiply);
    }
}
