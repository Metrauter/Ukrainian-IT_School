package classworks.lesson13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LacalDateDemo {
    public static void main(String[] args) {
        LocalDate myBirthday = LocalDate.of(1992,3,6);
        LocalDate today = LocalDate.now();

        System.out.println(myBirthday);

        int year = myBirthday.getYear();
        int month = myBirthday.getMonthValue();
        Month monthAsEnum = myBirthday.getMonth();
        int dayYear = myBirthday.getDayOfYear();
        int dayMonth = myBirthday.getDayOfMonth();
        DayOfWeek dayWeekEnum = myBirthday.getDayOfWeek();

        boolean after = myBirthday.isAfter(today);
        boolean before = myBirthday.isBefore(today);

        System.out.println("Год: " + year);
        System.out.println("Месяц: " + month);
        System.out.println("Название месяца: " + monthAsEnum);
        System.out.println("День в году: " + dayYear);
        System.out.println("День месяца: " + dayMonth);
        System.out.println("День недели: " + dayWeekEnum);

        System.out.println("myBirthday.isAfter(today): " + after);
        System.out.println("myBirthday.isBefore(today): " + before);
    }
}
