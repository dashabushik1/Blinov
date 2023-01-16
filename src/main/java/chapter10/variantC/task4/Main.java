/**
 * 4. При выполнении следующих заданий для вывода результатов создавать новую директорию и файл средствами класса File.
 * Прочитать текст Java-программы и в каждом слове длиннее двух символов все строчные символы заменить прописными.
 */
package chapter10.variantC.task4;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("./src/main/java/chapter10/variantC/task4/student.txt");
        File changedFile = new File("./src/main/java/chapter10/variantC/task4/outputTask4.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(changedFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("[\\s]+");
                bufferedWriter.append(System.lineSeparator());
                for (String word : words) {
                    if (word.length() > 2) {
                        bufferedWriter.append(word.toUpperCase()).append(" ");
                    } else {
                        bufferedWriter.append(word).append(" ");
                    }
                }
            }
        }
    }
}