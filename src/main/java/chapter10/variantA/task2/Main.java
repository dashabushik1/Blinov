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

public class Main {

    public static void main(String[] args) throws IOException {
        String path = "/Users/daryabushik/Desktop/files/variantA/task2.txt";
        String outputPath = "/Users/daryabushik/Desktop/files/variantA/outputTask2.txt";
        String substringToReplace = " ";
        String replacement = "**";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase().replaceAll(substringToReplace, replacement);
                writer.write(line);
                writer.write(System.lineSeparator());
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}