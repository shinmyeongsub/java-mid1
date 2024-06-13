package time;

import javax.xml.transform.Source;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2024,1,1,1,1,1);

        System.out.println("now = " + now);
        System.out.println("ofDt = " + ofDt);

        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);

        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("ofDtPlus = " + ofDtPlus);
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println("ofDtPlus1Year = " + ofDtPlus1Year);

        // 비교
        System.out.println("현재 날짜시간이 지정 날짜보다 어떤가? (이전) " + now.isBefore(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜보다 어떤가? (이후) " + now.isAfter(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜보다 어떤가? (동일) " + now.isEqual(ofDt));

    }
}
