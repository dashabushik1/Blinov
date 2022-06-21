/**
 * 6. Вывести фамилию разработчика, дату и время получения задания, а также
 * дату и время сдачи задания.
 */
package chapter1.task1;

import java.util.Date;

public class DevInfo {

    public static void main(String[] args) {
        String name = "Petrov";
        Date currentDate = new Date();  // создание текущей даты
        Date endDate = new Date(122, 5, 22);

        System.out.println("Developer: " + name);
        System.out.println("Date and time of begin of the task: " + currentDate + ".");
        System.out.println("Date and time of end of the task: " + endDate + ".");
    }
}