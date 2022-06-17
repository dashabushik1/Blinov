/**
 * 7. Ввести с консоли n целых чисел. На консоль вывести числа в порядке
 * убывания частоты встречаемости чисел.
 */
package chapter1.task2;

public class SortArrayByFrequency {

    public static void main(String[] args) {

        int[] inputNumbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            inputNumbers[i] = Integer.parseInt(args[i]);
            System.out.print(inputNumbers[i] + " ");
        }

        System.out.println(" ");
        int[] duplicates = new int[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            for (int j = 0; j < inputNumbers.length; j++) {
                if (inputNumbers[i] == inputNumbers[j]) {
                    duplicates[i]++;
                }
            }
            System.out.print(duplicates[i] + " ");
        }

        System.out.println(" ");
        for (int i = 0; i < duplicates.length; i++) {
            for (int j = i + 1; j < duplicates.length; j++) {
                if (duplicates[i] < duplicates[j]) {
                    int x = duplicates[j];
                    duplicates[j] = duplicates[i];
                    duplicates[i] = x;

                    x = inputNumbers[j];
                    inputNumbers[j] = inputNumbers[i];
                    inputNumbers[i] = x;

                } else if ((duplicates[i] == duplicates[j]) && (inputNumbers[i] < inputNumbers[j])) {
                    int x = inputNumbers[j];
                    inputNumbers[j] = inputNumbers[i];
                    inputNumbers[i] = x;
                }
            }
            System.out.print(inputNumbers[i] + " ");
        }

        System.out.println(" ");
        for (int i = 0; i < args.length; i++) {
            System.out.print(duplicates[i] + " ");
        }
    }
}


