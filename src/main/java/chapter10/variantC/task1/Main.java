/**
 * 1. При выполнении следующих заданий для вывода результатов создавать новую директорию и файл средствами класса File.
 * Создать и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию.
 */
package chapter10.variantC.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File outputFile = new File("./src/main/java/chapter10/variantC/task1/outputTask1.txt");

        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) ((Math.random() * 50) + 1);
        }

        for (int i = randomNumbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (randomNumbers[j] > randomNumbers[j + 1]) {
                    int k = randomNumbers[j];
                    randomNumbers[j] = randomNumbers[j + 1];
                    randomNumbers[j + 1] = k;
                }
            }
        }

        try (FileWriter writer = new FileWriter(outputFile)) {
            for (int number : randomNumbers) {
                String s = Integer.toString(number);
                writer.write(s);
                writer.append(" ");
            }
        }
    }
}

