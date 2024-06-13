package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        // 생성
        Instant now = Instant.now(); // UTC 기준
        System.out.println("now = " + now);

        ZonedDateTime now1 = ZonedDateTime.now();
        Instant from = Instant.from(now1); // UTC 기준이기 때문에 시간대 정보 필요 => LocalDateTime 사용 X
        System.out.println("from = " + from);

        Instant instant = Instant.ofEpochSecond(0);
        System.out.println("instant = " + instant);

        // 계산
        Instant instant1 = instant.plusSeconds(3600);
        System.out.println("instant1 = " + instant1);

        // 조회
        long epochSecond = instant1.getEpochSecond();
        System.out.println("epochSecond = " + epochSecond);
    }
}
