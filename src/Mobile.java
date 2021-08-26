import java.util.Date;

public class Mobile implements Paymentmethod {

    private final String serviceprovider;
    private final String mobilenumber;
    private final Date expires;

    public String getserviceprovider() {
        return serviceprovider;
    }

    public String getmobilenumber() {
        return mobilenumber;
    }

    public Date getexpires() {
        return expires;
    }

    public Mobile(String serviceprovider, String mobilenumber,
                         Date expires) {
        super();
        this.serviceprovider = serviceprovider;
        this.mobilenumber = mobilenumber;
        this.expires = expires;
    }

    @Override
    public boolean pay(double amount) {
        return true; // if payment goes through
    }
}
