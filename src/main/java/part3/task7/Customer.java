package part3.task7;

public class Customer {
    private Address address;

    public Customer(Address address) {
        this.address = address!= null? address : new NullAddress();
    }

    public Address getAddress() {
        return address;
    }
}