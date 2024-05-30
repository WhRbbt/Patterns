package CodeSmells.Lab5.Part3.Task7;

public class Customer {
    private Address address;

    public Customer(Address address) {
        if (address == null) {
            this.address = new NullAddress();
        } else {
            this.address = address;
        }
    }

    public Address getAddress() {
        return address;
    }
}
