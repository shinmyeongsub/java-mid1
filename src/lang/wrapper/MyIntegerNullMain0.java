package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        int result0 = findValue(intArr, -1);
        int result1 = findValue(intArr, 0);
        int result2 = findValue(intArr, 1);
        int result3 = findValue(intArr, 100);
        System.out.println("result0 = " + result0); // -1
        System.out.println("result1 = " + result1); // 0
        System.out.println("result2 = " + result2); // 1
        System.out.println("result3 = " + result3); // -1
    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if(value == target) {
                return value;
            }
        }
        return -1;
    }
}