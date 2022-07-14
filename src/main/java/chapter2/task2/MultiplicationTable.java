/**
 * 1. Вывести на экран таблицу умножения.
 */
package chapter2.task2;

public class MultiplicationTable {

    public static void main(String[] args) {

        int[][] table = new int[10][10];
        int row = 1;
        int column = 1;

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = row * column;
                column += 1;
            }
            row += 1;
            column = 1;
        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.printf(table[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
