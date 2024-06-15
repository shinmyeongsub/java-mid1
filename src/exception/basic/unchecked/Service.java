package exception.basic.unchecked;

/**
 * MyUnChecked 예외는
 * 예외를 잡거나, 던지지 않아도 됩니다.
 */
public class Service {
    Client client = new Client();

    public void callCatch() {
        try{
            client.call();
        } catch (MyUncheckedException e) {
            // 예외 처리 로직
            System.out.println("예외 처리, message= " + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    /**
     * 예외를 잡지 않아도 된다.
     * 자연스럽게 상위로 넘어감.
     * 체크 예외와 다르게 throws 선언하지 않아도 됨
     */
    public void callThrow() {
        client.call();
    }
}
