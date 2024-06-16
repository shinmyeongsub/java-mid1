package exception.ex4;
public class NetworkServiceV5 {
    public void sendMessage(String data) {
        String address = "http://example.com";

        try (NetworkClientV5 client = new NetworkClientV5(address)) { // try with resources -> 자원을 더 빨리 해제, 리소스 누수 방지
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e){
            System.out.println("[예외 확인] : " + e.getMessage());
            throw e;
        }
    }
}
