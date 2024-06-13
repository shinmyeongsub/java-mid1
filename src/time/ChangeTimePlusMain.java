package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2023,1,1,13,30,50);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime plus = localDateTime.plus(10, ChronoUnit.YEARS);
        System.out.println("plus = " + plus);

        LocalDateTime localDateTime1 = localDateTime.plusYears(10);
        System.out.println("localDateTime1 = " + localDateTime1);

        Period period = Period.ofYears(10);
        LocalDateTime plus1 = localDateTime.plus(period);
        System.out.println("plus1 = " + plus1);
    }
}
