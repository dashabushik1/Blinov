/* 6. Вывести фамилию разработчика, дату и время получения задания, а также
дату и время сдачи задания. */

package chapter1.task1;

import java.util.Calendar;
import java.util.Date;

public class DevInfo {

    public static void main (String args []){
        String name = "Petrov";
        Date date = new Date();
        System.out.println("Developer " + name);
        System.out.println("Date and time of receipt of the task: " + date);

        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2022);
        c.set(Calendar.MONTH, Calendar.JUNE);
        c.set(Calendar.DAY_OF_MONTH, 07);
        System.out.println("Date and time of assignment of the task: " + c.getTime());
    }
}