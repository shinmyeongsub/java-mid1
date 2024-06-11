package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노초)를 가져온다.
        long currentNano = System.nanoTime();
        System.out.println("currentNano = " + currentNano);

        // 환경 변수를 읽는다.
        System.out.println(System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println(System.getProperties());

        String property = System.getProperty("java.version");
        System.out.println("property = " + property);

        // 배열을 고속으로 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // 배열 출력
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));
        System.out.println("Arrays.toString() = " + copiedArray);

        // 프로그램 종료
        System.exit(0);
    }
}
