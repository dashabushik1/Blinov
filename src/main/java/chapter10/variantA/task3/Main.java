/**
 * 3. В следующих заданиях требуется ввести последовательность строк из текстового потока и выполнить указанные действия.
 * При этом могут рассматриваться два варианта:
 * • каждая строка состоит из одного слова;
 * • каждая строка состоит из нескольких слов.
 * Имена входного и выходного файлов, а также абсолютный путь к ним могут
 * быть введены как параметры командной строки или храниться в файле.
 * В каждой строке найти слова, начинающиеся с гласной буквы.
 */
package chapter10.variantA.task3;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String path = "./src/main/java/chapter10/variantA/task3/task3.txt";
        String outputPath = "./src/main/java/chapter10/variantA/task3/outputTask3.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(path));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("[\\s,.!?]+");
                for (String word : words) {
                    if (word.substring(0, 1).matches("[aeiouy]")) {
                        writer.write(word);
                        writer.append(" ");
                    }
                }
            }
        }
    }
}
