package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("localDateTime.get(ChronoField.YEAR) = " + localDateTime.get(ChronoField.YEAR));
        System.out.println("localDateTime.get(ChronoField.MONTH_OF_YEAR) = " + localDateTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("localDateTime.get(ChronoField.DAY_OF_MONTH) = " + localDateTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println("localDateTime.get(ChronoField.HOUR_OF_DAY) = " + localDateTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println("localDateTime.get(ChronoField.MINUTE_OF_HOUR) = " + localDateTime.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("localDateTime.get(ChronoField.SECOND_OF_MINUTE) = " + localDateTime.get(ChronoField.SECOND_OF_MINUTE));

        System.out.println("편의 메서드 제공");
        System.out.println("localDateTime.getYear() = " + localDateTime.getYear());
        System.out.println("localDateTime.getMonth() = " + localDateTime.getMonth());
        System.out.println("localDateTime.getHour() = " + localDateTime.getHour());
        System.out.println("localDateTime.getMinute() = " + localDateTime.getMinute());
        System.out.println("localDateTime.getSecond() = " + localDateTime.getSecond());

        // 보통 편의 메서드를 사용하고 편의 메서드가 없는 경우 아래와 같은 방법을 사용
        System.out.println("편의 메서드에 없음");
        System.out.println("localDateTime.get(ChronoField.MINUTE_OF_HOUR) = " + localDateTime.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("localDateTime.get(ChronoField.MONTH_OF_YEAR) = " + localDateTime.get(ChronoField.MONTH_OF_YEAR));
    }
}
