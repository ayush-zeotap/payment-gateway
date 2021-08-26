import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;
import org.junit.Test;


public class PaymentTest {
    @Test
    public void paybillusingcard() {

        Cart instance = new Cart();

        Item a = new Item("it01","Shirt", 750.00);
        instance.additem(a);

        Item b = new Item("it35","Bat", 100.50);
        instance.additem(b);

        Date expirydate = getcardexpireydate();
        Paymentmethod card = new Card("Ayush", "123423453456", expirydate);

        boolean result = instance.pay(card);
        assertTrue(result);

    }

    private Date getcardexpireydate() {
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(2022, Calendar.JANUARY, 21);
        return cal.getTime();
    }
}
