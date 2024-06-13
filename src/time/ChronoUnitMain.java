package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {
    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.println("value = " + value);
        }
        System.out.println("ChronoUnit.HOURS = " + ChronoUnit.HOURS);
        System.out.println("ChronoUnit.HOURS.getDuration().getSeconds() = " + ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println("ChronoUnit.DAYS = " + ChronoUnit.DAYS);
        System.out.println(ChronoUnit.DAYS.getDuration().getSeconds());

        // 차이 구하기
        LocalTime localTime = LocalTime.of(1, 10, 0);
        LocalTime localTime2 = LocalTime.of(1, 20, 0);

        long between = ChronoUnit.SECONDS.between(localTime, localTime2);
        System.out.println("between = " + between);

        long between1 = ChronoUnit.MINUTES.between(localTime, localTime2);
        System.out.println("between1 = " + between1);
    }
}
