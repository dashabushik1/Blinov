/**
 * 1. Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
 */
package chapter11.variantA.task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String output = "/Users/daryabushik/Desktop/collections/variantA/outputTask1.txt";
        Path failPath = Paths.get("/Users/daryabushik/Desktop/collections/variantA/task1.txt");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(output));
            List<String> lines = Files.readAllLines(failPath);
            StringBuilder builder = new StringBuilder();
            for (String line : lines) {
                builder.append(line).reverse();
                writer.write(builder.toString());
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
