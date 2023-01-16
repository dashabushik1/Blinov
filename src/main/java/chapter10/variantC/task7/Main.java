/**
 * 7. Сохранить в файл, связанный с выходным потоком, записи о телефонах и их владельцах.
 * Вывести в файл записи, телефоны в которых начинаются на k и на j.
 */
package chapter10.variantC.task7;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        String path = "./src/main/java/chapter10/variantC/task7/outputTask7.txt";
        File outputFile = new File(path);
        Map<String, String> data = new HashMap<>();

        data.put("Jack", "6754890");
        data.put("Sofia", "1001254");
        data.put("Paul", "6790056");
        data.put("Mary", "5439077");
        data.put("Kira", "2238700");
        data.put("Anastasia", "8907890");
        data.put("Aleksandr", "6549011");
        data.put("Lucas", "1227832");


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (Map.Entry<String, String> entry : data.entrySet()) {
                char value = entry.getValue().charAt(0);
                if (value == '1' || value == '6') {
                    writer.write(entry.getKey());
                    writer.write(" ");
                    writer.write(entry.getValue());
                    writer.write(System.lineSeparator());
                }
            }
        }
    }
}
