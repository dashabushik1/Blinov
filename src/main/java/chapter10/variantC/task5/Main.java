/**
 * 5. При выполнении следующих заданий для вывода результатов создавать новую директорию и файл средствами класса File.
 * В файле, содержащем фамилии студентов и их оценки, записать прописными буквами фамилии тех студентов, которые имеют средний балл более 7.
 */
package chapter10.variantC.task5;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("./src/main/java/chapter10/variantC/task5/student.txt");
        File outputFile = new File("./src/main/java/chapter10/variantC/task5/outputTask5.txt");
        String[] students;

        try (Scanner scanner = new Scanner(file);
             PrintWriter writer = new PrintWriter(outputFile)) {
            while (scanner.hasNextLine()) {
                students = scanner.nextLine().split("\\s+");
                double sum = 0;
                for (int i = 1; i < students.length; i++) {
                    sum += Integer.parseInt(students[i]);
                }
                if (sum / (students.length - 1) > 7) {
                    writer.write(students[0].toUpperCase());
                    writer.write(System.lineSeparator());
                }
            }
        }
    }
}
