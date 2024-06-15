package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {

        int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer {
            int value = 0;
            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("local value = " + localVar);
                System.out.println("param value = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
//        localPrinter.print(); 을 여기서 실행하지 않고 Printer 인스턴스만 반환한다.

        // 만약 localVar의 값을 변경한다면?
//        localVar = 10;
//        paramVar = 10;

        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuterV3 = new LocalOuterV4();
        Printer printer = localOuterV3.process(2);
        printer.print();

        // 추가
        System.out.println("필드 확인");
        Field[] declaredFields = printer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
    }
}
