/**
 * 6. При выполнении следующих заданий для вывода результатов создавать новую директорию и файл средствами класса File.
 * Прочитать строки из файла и поменять местами первое и последнее слово в каждой строке.
 */
package chapter10.variantC.task6;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("/Users/daryabushik/Desktop/files/variantC/task6.txt");
        String[] lines;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/daryabushik/Desktop/files/variantC/outputTask6.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                lines = line.split("[\\s.,]+");
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < lines.length; i++) {
                    String word = lines[0];
                    lines[0] = lines[lines.length - 1];
                    lines[lines.length - 1] = word;
                    sb.append(lines[i]).append(" ");
                }
                writer.write(sb.toString());
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

