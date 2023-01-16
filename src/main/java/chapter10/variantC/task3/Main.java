/**
 * 3. При выполнении следующих заданий для вывода результатов создавать новую директорию и файл средствами класса File.
 * Прочитать текст Java-программы и записать в другой файл в обратном порядке символы каждой строки.
 */
package chapter10.variantC.task3;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("./src/main/java/chapter10/variantC/task3/student.txt");
        File changedFile = new File("./src/main/java/chapter10/variantC/task3/outputTask3.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(changedFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String reverse = new StringBuilder(line).reverse().toString();
                bufferedWriter.write(reverse);
                bufferedWriter.newLine();
            }
        }
    }
}