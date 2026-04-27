package level2.exercise1;

public class SpainPhone implements Phone{
    private String phoneNumber;

    public SpainPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String getPhone() {
        return "+34 " + phoneNumber.substring(0, 3)
                + " " + phoneNumber.substring(3, 5)
                + " " + phoneNumber.substring(5, 7)
                + " " + phoneNumber.substring(7);
    }
}
