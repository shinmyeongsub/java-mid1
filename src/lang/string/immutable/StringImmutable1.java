package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        // String class는 불변 객체이다 -> String pool 의 인스턴스도 같이 변경되어버리면 안되기 때문에
        String str1 = "hello";
        String str2 = str1.concat(" java");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
