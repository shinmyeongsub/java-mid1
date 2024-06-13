package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate localDate = LocalDate.of(2013, 11, 21);
        System.out.println("오늘 날짜는 ? : " + now);
        System.out.println("지정 날짜는 ? : " + localDate);

        // 계산(불변)
        LocalDate localDate1 = localDate.plusDays(10); // 변경을 하기 위해선 반환값을 받아야합니다.
        System.out.println("지정 날짜 + 10일 ? : " + localDate1);
    }
}
