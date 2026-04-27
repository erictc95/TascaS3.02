package level2.exercise1;

public class USAPhone implements Phone{

    private String phoneNumber;

    public USAPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String getPhone() {
        return "+1 (" + phoneNumber.substring(0, 3) + ") "
                + phoneNumber.substring(3, 6) + "-"
                + phoneNumber.substring(6);
    }
}
