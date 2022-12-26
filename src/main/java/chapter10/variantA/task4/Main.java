/**
 * 4. В следующих заданиях требуется ввести последовательность строк из текстового потока и выполнить указанные действия.
 * При этом могут рассматриваться два варианта:
 * • каждая строка состоит из одного слова;
 * • каждая строка состоит из нескольких слов.
 * Имена входного и выходного файлов, а также абсолютный путь к ним могут
 * быть введены как параметры командной строки или храниться в файле.
 * Найти и вывести слова текста, для которых последняя буква одного слова
 * совпадает с первой буквой следующего слова.
 */
package chapter10.variantA.task4;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String> foundWords = new HashMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/daryabushik/Desktop/files/variantA/task4.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/daryabushik/Desktop/files/variantA/outputTask4.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("[\\s.,?!]+");
                for (int i = 0; i < words.length - 1; i++) {
                    if (Character.toLowerCase(words[i].charAt(words[i].length() - 1)) == Character.toLowerCase(words[i + 1].charAt(0))) {
                        foundWords.put(words[i], words[i + 1]);
                    }
                }
            }
            writer.write(foundWords.toString());
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
