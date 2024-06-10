package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        // 참조가 동일한지 비교
        System.out.println("new String() == 비교: " + (str1 == str2)); // false
        // 논리적으로 동일한지 비교
        System.out.println("new String() equals 비교: " + str1.equals(str2)); // true

        String str3 = "hello";
        String str4 = "hello";

        // keyword : 문자열 풀 (String pool)
        System.out.println("리터럴 == 비교 : " + (str3 == str4)); // true
        System.out.println("리터럴 equals 비교 : " + str3.equals(str4)); // true
    }
}