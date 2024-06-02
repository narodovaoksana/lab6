package part3.task7;

public class NullAddress extends Address {
    public NullAddress() {
        super("", "");
    }

    @Override
    public void setStreet(String street) {
        throw new UnsupportedOperationException("Cannot modify a NullAddress");
    }

    @Override
    public void setCity(String city) {
        throw new UnsupportedOperationException("Cannot modify a NullAddress");
    }
}
