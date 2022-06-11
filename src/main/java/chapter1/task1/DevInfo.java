/* 6. Вывести фамилию разработчика, дату и время получения задания, а также
дату и время сдачи задания. */

package chapter1.task1;

import java.util.Calendar;
import java.util.Date;

public class DevInfo {
    public static void main(String[] args) {
        String name = "Petrov";
        Date current = new Date(); // инициализация объекта date (выводит текущее время)

        Calendar calendar = Calendar.getInstance(); // создаем объект календаря
        calendar.set(Calendar.YEAR, 2022); // устанавливаем год
        calendar.set(Calendar.MONTH, 5); // устанавливаем месяц
        calendar.set(Calendar.DATE, 7); // устанавливаем день
        Date date = calendar.getTime(); // создаем объект с указанным временем

        System.out.println("Developer: " + name);
        System.out.println("Date and time of receipt of the task: " + current);
        System.out.println("Date and time of assignment of the task: " + date);

    }
}