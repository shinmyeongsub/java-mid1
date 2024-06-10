package lang.string.test;

public class TestString7 {
    public static void main(String[] args) {
        String original = "      Hello Java    ";
        String trimedOriginal = original.trim();
        String stripedOriginal = original.strip();
        System.out.println("trimedOriginal = " + trimedOriginal);
        System.out.println("stripedOriginal = " + stripedOriginal);
    }
}
