import java.util.ArrayList;
import java.util.List;


public class Cart {
    private List<Item> items;

    public Cart() {
        items = new ArrayList();
    }

    public void additem(Item item) {
        items.add(item);
    }

    public double calctotalcost() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getprice();
        }
        return total;
    }

    public boolean pay(Paymentmethod method) {
        double totalcost = calctotalcost();
        return method.pay(totalcost);
    }
}
