package lang.object.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있습니다.
        Address address1 = new Address("서울");
        Address address2 = address1;
        System.out.println("a = " + address1);
        System.out.println("b = " + address2);

        change(address2,"부산"); // b의 값을 부산으로 변경
        System.out.println("a = " + address1);
        System.out.println("b = " + address2);
    }

    private static void change(Address address, String changeAddress) {
        System.out.println("주소 값을 변경합니다. -> "
        + changeAddress);
        address.setValue(changeAddress);
    }
}
