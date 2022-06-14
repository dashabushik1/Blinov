/**
 * 6. Вывести фамилию разработчика, дату и время получения задания, а также
 * дату и время сдачи задания.
 */
package chapter1.task1;

public class DevInfo {

    public static void main(String[] args) {
        String name = "Petrov";
        String dateOfBeginTask = "14.06.2022";
        String timeOfBeginTask = "12:00";
        String dateOfEndTask = "20.06.2022";
        String timeOfEndTask = "12:00";

        System.out.println("Developer: " + name);
        System.out.println("Date and time of begin of the task: " + dateOfBeginTask + ", " + timeOfBeginTask + ".");
        System.out.println("Date and time of end of the task: " + dateOfEndTask + ", " + timeOfEndTask + ".");
    }
}