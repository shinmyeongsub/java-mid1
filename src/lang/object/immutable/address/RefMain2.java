package lang.object.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있습니다.
        ImmutableAddress address1 = new ImmutableAddress("서울"); // x001
        ImmutableAddress address2 = address1; // 참조값 대입을 막을 순 없다. x001
        System.out.println("a = " + address1);
        System.out.println("b = " + address2);

//        address2.setValue("부산"); // b의 값을 부산으로 변경
        // 제약을 주어 사이드 이펙트를 막을 수 있다.
        address2 = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + address1);
        System.out.println("b = " + address2);
    }
}
