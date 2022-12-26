/**
 * 5. В следующих заданиях требуется ввести последовательность строк из текстового потока и выполнить указанные действия.
 * При этом могут рассматриваться два варианта:
 * • каждая строка состоит из одного слова;
 * • каждая строка состоит из нескольких слов.
 * Имена входного и выходного файлов, а также абсолютный путь к ним могут
 * быть введены как параметры командной строки или храниться в файле.
 * Найти в строке наибольшее число цифр, следующих подряд.
 */
package chapter10.variantA.task5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Path failPath = Paths.get("/Users/daryabushik/Desktop/files/variantA/task5.txt");
        String result = null;
        int maxLength = 0;

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/daryabushik/Desktop/files/variantA/outputTask5.txt"));
            List<String> lines = Files.readAllLines(failPath);
            for (String line : lines) {
                Matcher matcher = Pattern.compile("\\d+").matcher(line);
                while (matcher.find()) {
                    result = matcher.group();
                    if (result.length() > maxLength) {
                        maxLength = result.length();
                    }
                }
                writer.write(result);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(result + " " + maxLength);
    }
}
