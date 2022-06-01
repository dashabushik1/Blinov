/* 6. Вывести фамилию разработчика, дату и время получения задания, а также
дату и время сдачи задания. */

package chapter1.task1;

import java.util.Calendar;
import java.util.Date;

public class DevInfo {

    public static void main (String args []){
        String name = "Petrov";
        Date current = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, 5);
        calendar.set(Calendar.DATE, 7);
        Date date = calendar.getTime();

        System.out.println("Developer " + name);
        System.out.println("Date and time of receipt of the task: " + current);
        System.out.println("Date and time of assignment of the task: " + date);

    }
}