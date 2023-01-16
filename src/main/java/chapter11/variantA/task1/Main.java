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
    public static void main(String[] args) throws IOException {
        Path failPath = Paths.get("./src/main/java/chapter11/variantA/task1/task1.txt");
        String output = "./src/main/java/chapter11/variantA/task1/outputTask1.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(output))) {
            List<String> lines = Files.readAllLines(failPath);
            StringBuilder builder = new StringBuilder();
            for (String line : lines) {
                builder.append(line).reverse();
                writer.write(builder.toString());
            }
        }
    }
}
