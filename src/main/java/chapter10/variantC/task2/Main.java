/**
 * 2. При выполнении следующих заданий для вывода результатов создавать новую директорию и файл средствами класса File.
 * Прочитать текст Java-программы и все слова public в объявлении атрибутов и методов класса заменить на слово private.
 */
package chapter10.variantC.task2;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("./src/main/java/chapter10/variantC/task2/student.txt");
        File changedFile = new File("./src/main/java/chapter10/variantC/task2/outputTask2.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter(changedFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.append(line.replace("public", "private")).append(System.lineSeparator());
            }
        }
    }
}
