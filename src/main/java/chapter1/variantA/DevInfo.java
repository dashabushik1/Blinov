/**
 * 6. Вывести фамилию разработчика, дату и время получения задания, а также
 * дату и время сдачи задания.
 */
package chapter1.variantA;

import java.util.Date;

public class DevInfo {

    public static void main(String[] args) {
        String name = "Petrov";
        Date currentDate = new Date();  // создание текущей даты
        Date endDate = new Date();

        endDate.setTime(currentDate.getTime() + 7 * 24 * 60 * 60 * 1000);

        System.out.println("Developer: " + name);
        System.out.println("Date and time of begin of the task: " + currentDate + ".");
        System.out.println("Date and time of end of the task: " + endDate + ".");
    }
}