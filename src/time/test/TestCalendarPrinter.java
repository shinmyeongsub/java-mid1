package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도 입력 : ");
        int i = scanner.nextInt();

        System.out.print("월 입력 : ");
        int i1 = scanner.nextInt();

        printCalendar(i,i1);
    }

    private static void printCalendar(int i, int i1) {
        LocalDate localDate = LocalDate.of(i, i1, 1);
        LocalDate localDate1 = localDate.plusMonths(1);

        int i2 = localDate.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fi Sa");
        for (int j = 0; j < i2; j++) {
            System.out.print("   ");
        }

        LocalDate dayIterator = localDate;
        while (dayIterator.isBefore(localDate1)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if(dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY){
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
