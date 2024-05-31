package part1.task8;

import java.time.LocalDate;
import java.util.Date;

public class DateHelper {
    public static LocalDate addDays(LocalDate date, int days) {
        return date.plusDays(days);
    }

}