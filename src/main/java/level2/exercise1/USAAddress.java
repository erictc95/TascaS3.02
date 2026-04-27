package level2.exercise1;

public class USAAddress implements Address{
    private String streetAndNumber;
    private String city;
    private String stateZip;


    public USAAddress(String streetAndNumber, String city, String stateZip) {
        this.streetAndNumber = streetAndNumber;
        this.city = city;
        this.stateZip = stateZip;
    }


    @Override
    public String getAddress() {
        return streetAndNumber + ", " + city + ", " + stateZip;
    }
}
