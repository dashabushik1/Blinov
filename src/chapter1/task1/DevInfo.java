/* 6. Вывести фамилию разработчика, дату и время получения задания, а также
дату и время сдачи задания. */

package chapter1.task1;

import java.util.Calendar;
import java.util.Date;

public class DevInfo {
    public static void main(String[] args) {
        String name = "Petrov";
        Date current = new Date(); // инициализация объекта date (выводит текущее время)

        Calendar calendar = Calendar.getInstance(); // создаем календарь
        calendar.set(Calendar.YEAR, 2022); // изменяем год
        calendar.set(Calendar.MONTH, 5); // изменяем месяц
        calendar.set(Calendar.DATE, 7); // изменяем день
        Date date = calendar.getTime(); // отображаем введенную дату

        System.out.println("Developer: " + name);
        System.out.println("Date and time of receipt of the task: " + current);
        System.out.println("Date and time of assignment of the task: " + date);

    }
}