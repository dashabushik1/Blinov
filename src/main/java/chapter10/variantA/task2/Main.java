/**
 * 2. В следующих заданиях требуется ввести последовательность строк из текстового потока и выполнить указанные действия.
 * При этом могут рассматриваться два варианта:
 * • каждая строка состоит из одного слова;
 * • каждая строка состоит из нескольких слов.
 * Имена входного и выходного файлов, а также абсолютный путь к ним могут
 * быть введены как параметры командной строки или храниться в файле.
 * В каждой строке стихотворения найти и заменить заданную подстроку на подстроку иной длины.
 */
package chapter10.variantA.task2;

import java.io.*;

public class Main { // Абсолютный путь начинается с корневой директории. Относительный путь считается относительно какой-то директории.

    public static void main(String[] args) throws IOException {
        String path = "./src/main/java/chapter10/variantA/task2/task2.txt";
        String outputPath = "./src/main/java/chapter10/variantA/task2/outputTask2.txt";
        String substringToReplace = " ";
        String replacement = "**";

        try (BufferedReader reader = new BufferedReader(new FileReader(path));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase().replaceAll(substringToReplace, replacement);
                writer.write(line);
                writer.write(System.lineSeparator());
            }
        }
    }
}
