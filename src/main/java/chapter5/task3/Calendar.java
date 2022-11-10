package chapter5.task3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.TextStyle;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Calendar {

    private final Set<MonthDay> holidays = new HashSet<>();
    private HolidayData holidayData;

    public Calendar() {
        this.holidayData = new HolidayData();
    }

    public void addHoliday(final MonthDay monthDay) { // метод позволяет добавить месяц и день праздников
        holidays.add(monthDay);
    }

    // метод показывает выходные и праздничные дни в определенный период
    public void showWeekendAndHolidaysBetween(final LocalDate startFrom, final LocalDate endTo) {
        System.out.println("Weekends and holidays between: " + startFrom + " and " + endTo + " are " +
                holidayData.numberOfWeekendAndHolidayBetween(startFrom, endTo) + ".");
        for (LocalDate i = startFrom; !i.isAfter(endTo); i = i.plusDays(1)) {
            if (holidayData.isHoliday(i)) {
                System.out.println("|Date: " + i + " |Day: " + i.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US));
            }
        }
    }

    private class HolidayData {

        public boolean isHoliday(final LocalDate localDate) {
            return isWeekend(localDate) || holidays.contains(toMonthDay(localDate));
        }

        public int numberOfWeekendAndHolidayBetween(final LocalDate startFrom, final LocalDate endTo) {
            int count = 0;
            for (LocalDate i = startFrom; !i.isAfter(endTo); i = i.plusDays(1)) {
                if (isHoliday(i)) {
                    count++;
                }
            }
            return count;
        }

        public boolean isWeekend(final LocalDate localDate) { // метод возвращает выходные(SATURDAY || SUNDAY)
            final DayOfWeek dayOfWeek = localDate.getDayOfWeek();
            return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
        }

        public MonthDay toMonthDay(final LocalDate localDate) { // метод возвращает месяц и день
            return MonthDay.of(localDate.getMonth(), localDate.getDayOfMonth());
        }
    }
}
