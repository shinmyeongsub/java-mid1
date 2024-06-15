package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        // 내부 클래스는 외부 클래스 내부에 소속이 되는 것이라 외부 클래스를 먼저 선언을 해야 내부 클래스를 사용 가능
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();

        System.out.println("inner.getClass() = " + inner.getClass());
    }
}
