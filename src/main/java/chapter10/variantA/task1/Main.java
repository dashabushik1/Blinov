/**
 * 1. В следующих заданиях требуется ввести последовательность строк из текстового потока и выполнить указанные действия.
 * При этом могут рассматриваться два варианта:
 * • каждая строка состоит из одного слова;
 * • каждая строка состоит из нескольких слов.
 * Имена входного и выходного файлов, а также абсолютный путь к ним могут
 * быть введены как параметры командной строки или храниться в файле.
 * В каждой строке найти и удалить заданную подстроку.
 */
package chapter10.variantA.task1;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String path = "./src/main/java/chapter10/variantA/task1/task1.txt";
        String output = "./src/main/java/chapter10/variantA/task1/outputTask1.txt";
        String substringToRemove = "dolls";

        try (FileWriter writer = new FileWriter(output)) {
            String result = readLinesFromFile(path).toString().replaceAll(substringToRemove, "");
            writer.write(result);
            writer.write("\n");
        }
        // try-with-resources - позволяет объявлять ресурсы для использования в блоке try с гарантией того,
        // что ресурсы будут закрыты после выполнения этого блока.
    }

    public static StringBuilder readLinesFromFile(String path) throws IOException { // метод читает файл построчно
        try (Scanner scanner = new Scanner(new File(path))) {
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine().toLowerCase());
            }
            return sb;
        }
    }
}
