package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException{ // throws -> 예외를 밖으로 던짐
        // 문제 상황 발생 , throw -> 예외를 발생시킬 수 있음
        throw new MyCheckedException("ex");
    }
}
