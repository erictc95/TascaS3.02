package level2.exercise1;

public class Contact {
    private Address address;
    private Phone phone;

    public Contact(ContactFactory factory) {
        address = factory.createAddress();
        phone = factory.createPhone();
    }

    @Override
    public String toString() {
        return "Address: " + address.getAddress() +
                " | Phone: " + phone.getPhone();
    }
}
