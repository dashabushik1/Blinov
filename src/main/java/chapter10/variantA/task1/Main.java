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

    public static void main(String[] args) {
        String filePath = "/Users/daryabushik/Desktop/files/variantA/task1.txt";
        String substringToRemove = "dolls";

        try (PrintWriter writer = new PrintWriter("/Users/daryabushik/Desktop/files/variantA/outputTask1.txt")) {
            String result = fileToString(filePath);
            result = result.replaceAll(substringToRemove, "");
            writer.append(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String fileToString(String filePath) throws Exception { // метод конвертирует файл в строки
        Scanner scanner = new Scanner(new File(filePath));
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            sb.append(input.toLowerCase());
        }
        return sb.toString();
    }
}
