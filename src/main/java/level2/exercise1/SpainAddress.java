package level2.exercise1;

public class SpainAddress implements Address{
    private String streetAndNumber;
    private String postalCode;
    private String city;


    public SpainAddress(String streetAndNumber, String postalCode, String city) {
        this.streetAndNumber = streetAndNumber;
        this.postalCode = postalCode;
        this.city = city;
    }


    @Override
    public String getAddress() {
        return streetAndNumber + ", " + postalCode + " " + city;
    }
}
