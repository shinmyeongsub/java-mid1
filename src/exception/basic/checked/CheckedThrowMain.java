package exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws Exception {
        Service service = new Service();
        service.catchThrow();
        System.out.println("정상 종료");
    }
}