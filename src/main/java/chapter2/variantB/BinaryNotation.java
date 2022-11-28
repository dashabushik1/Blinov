/**
 * 5. Сколько значащих нулей в двоичной записи числа 129?
 */
package chapter2.variantB;

public class BinaryNotation {  // Значащие нули – это нули, которые нельзя отбросить.

    public static void main(String[] args) {

        int primary = 129; // 10000001
        int[] binNum = new int[10];
        int i = 1;
        int count = 0;

        while (primary != 0) {
            binNum[i++] = primary % 2;
            primary /= 2;
        }

        for (int j = i - 1; j > 0; j--) {
            if (binNum[j] == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
