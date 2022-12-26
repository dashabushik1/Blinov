/**
 * 2. При выполнении следующих заданий для вывода результатов создавать новую директорию и файл средствами класса File.
 * Прочитать текст Java-программы и все слова public в объявлении атрибутов и методов класса заменить на слово private.
 */
package chapter10.variantC.task2;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/daryabushik/Desktop/files/variantC/Student.txt");
        File changedFile = new File("/Users/daryabushik/Desktop/files/variantC/outputTask2.txt");

        if (file.exists()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(changedFile))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.append(line.replace("public", "private")).append(System.lineSeparator());
                }
            }
        }
    }
}
