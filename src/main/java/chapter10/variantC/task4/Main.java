/**
 * 4. При выполнении следующих заданий для вывода результатов создавать новую директорию и файл средствами класса File.
 * Прочитать текст Java-программы и в каждом слове длиннее двух символов все строчные символы заменить прописными.
 */
package chapter10.variantC.task4;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {   // todo

    public static void main(String[] args) {
        File file = new File("/Users/daryabushik/Desktop/files/variantC/Student.txt");
        File changedFile = new File("/Users/daryabushik/Desktop/files/variantC/outputTask4.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(changedFile))) {
            StringBuilder builder = new StringBuilder();
            String line;
            String word;
            int offset = 0;
            Pattern pattern = Pattern.compile("\".{2,}\"");
            while ((line = bufferedReader.readLine()) != null) {
                Scanner scanner = new Scanner(line);
                while (scanner.hasNext()) {
                    word = scanner.next();
                    Matcher matcher = pattern.matcher(word);
                    if (matcher.matches()) {
                        builder.append(matcher.group().toUpperCase()).append(" ");
                    } else {
                        builder.append(word).append(" ");
                    }
                }
                bufferedWriter.write(builder.toString(), offset, (builder.length() - offset));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
