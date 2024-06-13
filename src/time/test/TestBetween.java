package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 1, 1);
        LocalDate localDate1 = LocalDate.of(2024, 11, 21);

        Period period = Period.between(localDate,localDate1);
        long between = ChronoUnit.DAYS.between(localDate, localDate1);
        System.out.println("localDate = " + localDate);
        System.out.println("localDate1 = " + localDate1);

        System.out.println("period = " + period);
        System.out.println("between = " + between);
    }
}
