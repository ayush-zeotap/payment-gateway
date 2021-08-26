import java.util.Date;

public class Card implements Paymentmethod {

    private final String name;
    private final String cardnumber;
    private final Date expires;

    public String getname() {
        return name;
    }

    public String getcardnumber() {
        return cardnumber;
    }

    public Date getexpires() {
        return expires;
    }

    public Card(String name, String cardnumber, Date expires) {
        super();
        this.name = name;
        this.cardnumber = cardnumber;
        this.expires = expires;
    }

    @Override
    public boolean pay(double amount) {
        return true; // if payment goes through
    }
}
