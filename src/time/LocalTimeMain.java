package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime localTime = LocalTime.of(9, 10, 30);

        System.out.println("nowTime = " + nowTime);
        System.out.println("localTime = " + localTime);

        // 계산 (불변)
        LocalTime localTime1 = localTime.plusSeconds(30);
        System.out.println("localTime1 = " + localTime1);
    }
}
