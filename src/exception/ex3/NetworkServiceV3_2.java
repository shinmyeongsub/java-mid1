package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;

public class NetworkServiceV3_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data); // SendExceptionV3
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + " , message : " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) { // 상위에서 잡기 전에 디테일한것을 놓아야함
            System.out.println("[네트워크 오류] 메세지 : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메세지 : " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
