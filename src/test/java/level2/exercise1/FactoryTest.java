package level2.exercise1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FactoryTest {

    private String expectedSpainContact = "Address: Passeig de potosí, 2, 08030 Barcelona | Phone: +34 607 43 22 32";
    private String expectedUSAContact = "Address: 767 5th Ave, New York, 10153 | Phone: +1 (212) 336-1440";

    @Test
    void contactSpain() {
        ContactFactory spainContactFactory = new SpainContactFactory("Passeig de potosí, 2", "08030", "Barcelona", "607432232");
        Contact spainContact = new Contact(spainContactFactory);
        assertEquals(expectedSpainContact, spainContact.toString());
    }

    @Test
    void contactUSA() {
        ContactFactory usaContactFactory = new USAContactFactory("767 5th Ave", "New York", "10153", "2123361440");
        Contact usaContact = new Contact(usaContactFactory);
        assertEquals(expectedUSAContact, usaContact.toString());
    }
}
