package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV3 {
    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        process.run();
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        // 지역 클래스로 만들었다
        Process dice = new Process() {
            @Override
            public void run () {
                int i = new Random().nextInt(6) + 1;
                System.out.println("i = " + i);
            }
        };

        Process sum = new Process() {
            @Override
            public void run () {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };

        hello(dice);
        hello(sum);
    }
}
