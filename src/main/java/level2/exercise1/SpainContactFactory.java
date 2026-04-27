package level2.exercise1;

public class SpainContactFactory implements ContactFactory {

    private String streetAndNumber;
    private String postalCode;
    private String city;
    private String phoneNumber;

    public SpainContactFactory(String streetAndNumber, String postalCode, String city, String phoneNumber) {
        this.streetAndNumber = streetAndNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Address createAddress() {
        return new SpainAddress(streetAndNumber, postalCode, city);
    }

    @Override
    public Phone createPhone() {
        return new SpainPhone(phoneNumber);
    }
}


