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

    public static void main(String[] args) throws IOException {
        Path mainDirectory = Paths.get("/Users/daryabushik/JAVA/Blinov");

        try (Stream<Path> stream = Files.walk(mainDirectory, Integer.MAX_VALUE)) {
            List<String> collect = stream
                    .map(String::valueOf)
                    .sorted()
                    .toList();
            collect.forEach(System.out::println);
        }
    }
}
