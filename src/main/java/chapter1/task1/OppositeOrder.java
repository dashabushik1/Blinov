/**
 * 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */
package chapter1.task1;

public class OppositeOrder {

    public static void main(String[] args) {
        for (int i = args.length - 1; (i >= 0) && (i < args.length); i--) {
            System.out.println(args[i]);
        }
    }
}
