package level2.exercise1;

public class USAContactFactory implements ContactFactory{

    private String streetAndNumber;
    private String city;
    private String stateZip;
    private String phoneNumber;

    public USAContactFactory(String streetAndNumber, String city, String stateZip, String phoneNumber) {
        this.streetAndNumber = streetAndNumber;
        this.city = city;
        this.stateZip = stateZip;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Address createAddress() {
        return new USAAddress(streetAndNumber, city, stateZip);
    }

    @Override
    public Phone createPhone() {
        return new USAPhone(phoneNumber);
    }
}



