package enumeration.ex1;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급
        int vip = discountService.discount("vip", price);
        System.out.println("vip = " + vip);

        // 오타
        int diamond = discountService.discount("Diamond", price);
        System.out.println("diamond = " + diamond);

        // 대문자 입력
        int gold = discountService.discount("GOLD", price);
        System.out.println("gold = " + gold);
    }
}
