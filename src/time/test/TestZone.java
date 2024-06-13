package time.test;

import java.time.*;

public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(9, 10), ZoneId.of("Asia/Seoul"));
        ZonedDateTime zonedDateTime1 = zonedDateTime.withZoneSameInstant(ZoneId.of("Europe/London"));

        System.out.println("zonedDateTime = " + zonedDateTime);
        System.out.println("zonedDateTime1 = " + zonedDateTime1);
    }
}
