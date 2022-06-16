/**
 * 7.Ввести с консоли n целых чисел. На консоль вывести отсортированные числа в порядке возрастания и убывания.
 */
package chapter1.task2;

public class SortInDifferentOrder {

    public static void main(String[] args) {

        int[] masSorted = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            masSorted[i] = Integer.parseInt(args[i]);
        }


        System.out.print("Ascending order: ");
        for (int i = 0; i < masSorted.length; i++) {
            for (int j = i + 1; j < masSorted.length; j++) {
                if (masSorted[i] > masSorted[j]) {
                    int value = masSorted[j];
                    masSorted[j] = masSorted[i];
                    masSorted[i] = value;
                }
            }
            System.out.print(masSorted[i] + " ");
        }

        System.out.println(" ");
        System.out.print("Descending order: ");
        for (int i = 0; i < masSorted.length; i++) {
            for (int j = i + 1; j < masSorted.length; j++) {
                if (masSorted[i] < masSorted[j]) {
                    int value = masSorted[j];
                    masSorted[j] = masSorted[i];
                    masSorted[i] = value;
                }
            }

            for (int j = 0; j < args.length; j++) {
                System.out.print(masSorted[i] + " ");
            }
        }
    }
}

