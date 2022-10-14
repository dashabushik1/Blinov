/**
 * 3. Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию
 * о выходных и праздничных днях.
 */
package chapter5.task3;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class Main {

    public static void main(String[] args) {

        Calendar calendar = new Calendar();

        calendar.addHoliday(MonthDay.of(Month.MARCH, 8));
        calendar.addHoliday(MonthDay.of(Month.MAY, 1));
        calendar.addHoliday(MonthDay.of(Month.MAY, 9));
        calendar.addHoliday(MonthDay.of(Month.OCTOBER, 14));
        calendar.addHoliday(MonthDay.of(Month.DECEMBER, 31));

        calendar.showWeekendAndHolidaysBetween(LocalDate.of(2021, 10, 10),
                LocalDate.of(2022, 10, 10));
    }
}
