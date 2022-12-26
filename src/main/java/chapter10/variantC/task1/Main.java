/**
 * 1. При выполнении следующих заданий для вывода результатов создавать новую директорию и файл средствами класса File.
 * Создать и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию.
 */
package chapter10.variantC.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File outputFile = new File("/Users/daryabushik/Desktop/files/variantC/randomNumbers.txt");

        int length = 10;
        int[] randomNumbers = new int[length];
        for (int i = 0; i < length; i++) {
            randomNumbers[i] = (int) ((Math.random() * 50) + 1);
        }

        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (randomNumbers[j] > randomNumbers[j + 1]) {
                    int k = randomNumbers[j];
                    randomNumbers[j] = randomNumbers[j + 1];
                    randomNumbers[j + 1] = k;
                }
            }
        }

        try {
            FileWriter writer = new FileWriter(outputFile);
            for (int number : randomNumbers) {
                String s = Integer.toString(number);
                writer.write(s);
                writer.append(" ");
                System.out.println(s);
            }
            writer.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}

