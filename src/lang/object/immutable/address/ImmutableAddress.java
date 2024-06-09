package lang.object.immutable.address;

public class ImmutableAddress {

    // final을 넣어서 value 값을 수정하지 못하게 만듬
    private final String value;

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }

    public String getValue() {
        return value;
    }

    public ImmutableAddress(String value) {
        this.value = value;
    }
}
