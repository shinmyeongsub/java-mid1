package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        // 묵시적으로 "hello" -> new String("hello") 로 변환해줌
        // java 8 이후 char[] -> byte[]
        String str1 = "hello";
        String str2 = new String("hello");

        System.out.println(str1);
        System.out.println(str2);
    }
}
