/**
 * 3. Создать список из элементов каталога и его подкаталогов.
 */
package chapter11.variantA.task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Path mainDirectory = Paths.get("/Users/daryabushik/Desktop/files");

        try (Stream<Path> stream = Files.walk(mainDirectory, Integer.MAX_VALUE)) {
            List<String> collect = stream
                    .map(String::valueOf)
                    .sorted()
                    .toList();
            collect.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
