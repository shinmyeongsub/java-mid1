package lang.string.builder;

public class StringBuilderMain_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = sb.append("A").append("B").append("C").append("D").append("E")
                .insert(4,"Java")
                .delete(4,8)
                .reverse()
                .toString();

        System.out.println("string = " + str);
    }
}
