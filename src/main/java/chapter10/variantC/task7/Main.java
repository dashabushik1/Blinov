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
        String path = "/Users/daryabushik/Desktop/files/task7.txt";
        File outputFile = new File(path);
        Map<String, String> data = new HashMap<>();

        data.put("Jack", "6754890");
        data.put("Sofia", "1001254");
        data.put("Paul", "6790056");
        data.put("Mary", "5439077");
        data.put("Lucas", "1227832");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            for (Map.Entry<String, String> value : data.entrySet()) {
                if (value.getValue().charAt(0) == '1' || value.getValue().charAt(0) == '6') {
                    writer.write(value.getKey());
                    writer.write(" ");
                    writer.write(value.getValue());
                    writer.write(System.lineSeparator());
                }
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
