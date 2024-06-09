package lang.object.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있습니다.
        // 각각 서로 다른 인스턴스를 참조함
        Address address1 = new Address("서울"); // x001
        Address address2 = new Address("서울"); // x002
        System.out.println("a = " + address1);
        System.out.println("b = " + address2);

        address2.setValue("부산"); // b의 값을 부산으로 변경
        System.out.println("부산 -> b");
        System.out.println("a = " + address1);
        System.out.println("b = " + address2);
    }
}
