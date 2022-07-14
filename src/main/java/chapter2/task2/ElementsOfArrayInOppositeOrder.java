/**
 * 2. Вывести элементы массива в обратном порядке.
 */
package chapter2.task2;

public class ElementsOfArrayInOppositeOrder {

    public static void main(String[] args) {
        String[] inputValues = new String[args.length];
        String temp;

        for (int i = 0; i < args.length; i++) {
            inputValues[i] = args[i];
        }

        for (int i = 0; i < inputValues.length / 2; i++) {
            temp = inputValues[inputValues.length - i - 1];
            inputValues[inputValues.length - i - 1] = inputValues[i];
            inputValues[i] = temp;
        }

        for (int i = 0; i < inputValues.length; i++) {
            System.out.print(inputValues[i] + " ");
        }
    }
}
