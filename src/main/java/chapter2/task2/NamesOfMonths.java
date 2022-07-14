/**
 * 9. Ввести число от 1 до 12. Вывести на консоль название месяца,
 * соответствующего данному числу. Осуществить проверку корректности ввода чисел.
 */
package chapter2.task2;

public class NamesOfMonths {

    public static void main(String[] args) {

        int monthNumbers = 0;
        for (int i = 0; i < args.length; i++) {
            monthNumbers = Integer.parseInt(args[i]);
        }

        try {
            if (monthNumbers == 1) {
                System.out.println("January");
            } else if (monthNumbers == 2) {
                System.out.println("February");
            } else if (monthNumbers == 3) {
                System.out.println("March");
            } else if (monthNumbers == 4) {
                System.out.println("April");
            } else if (monthNumbers == 5) {
                System.out.println("May");
            } else if (monthNumbers == 6) {
                System.out.println("June");
            } else if (monthNumbers == 7) {
                System.out.println("July");
            } else if (monthNumbers == 8) {
                System.out.println("August");
            } else if (monthNumbers == 9) {
                System.out.println("September");
            } else if (monthNumbers == 10) {
                System.out.println("October");
            } else if (monthNumbers == 11) {
                System.out.println("November");
            } else if (monthNumbers == 12) {
                System.out.println("December");
            }
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
    }
}
