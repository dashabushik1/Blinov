/**
 * 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */
package chapter1.variantA;

public class OppositeOrder {

    public static void main(String[] args) {

        if (args.length == 0) {  // проверка аргументов
            return;
        }

        for (int i = args.length - 1; (i >= 0) && (i < args.length); i--) {
            System.out.println(args[i]);
        }

        int i = args.length - 1;
        do {
            System.out.println(args[i]);                   // loop do...while
            i--;
        } while ((i >= 0) && (i < args.length));

        int j = args.length - 1;
        while ((j >= 0) && (j < args.length)) {            // loop while
            System.out.println(args[j]);
            j--;
        }
    }
}


