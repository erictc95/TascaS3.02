package level2.exercise1;

public class FactoryMain {
    public static void main(String[] args) {
        ContactFactory spainContactFactory = new SpainContactFactory("Passeig de potosí, 2", "08030", "Barcelona", "607432232");
        Contact spainContact = new Contact(spainContactFactory);
        System.out.println(spainContact);

        ContactFactory usaContactFactory = new USAContactFactory("767 5th Ave", "New York", "NY 10153", "2123361440");
        Contact usaContact = new Contact(usaContactFactory);
        System.out.println(usaContact);
    }
}
