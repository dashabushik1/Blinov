/**
 * 8. Ввести строки из файла, записать в список ArrayList.
 * Выполнить сортировку строк, используя метод sort() из класса Collections.
 */
package chapter11.variantA.task8;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/daryabushik/Desktop/collections/text.txt");
        List<String> listOfLines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                listOfLines.add(line);
            }
            Collections.sort(listOfLines);
        }
        System.out.println(listOfLines);
    }
}
