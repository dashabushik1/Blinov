/**
 * 6. При выполнении следующих заданий для вывода результатов создавать новую директорию и файл средствами класса File.
 * Прочитать строки из файла и поменять местами первое и последнее слово в каждой строке.
 */
package chapter10.variantC.task6;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("./src/main/java/chapter10/variantC/task6/task6.txt");
        String[] words;

        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/java/chapter10/variantC/task6/outputTask6.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words = line.split("[\\s.,]+");
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < words.length; i++) {
                    String word = words[0];
                    words[0] = words[words.length - 1];
                    words[words.length - 1] = word;
                    sb.append(words[i]).append(" ");
                }
                writer.write(sb.toString());
            }
        }
    }
}

