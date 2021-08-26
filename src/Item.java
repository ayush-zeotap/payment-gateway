public class Item {
    private final String code;
    private final String name;
    private final Double price;

    public Item(String code, String name, Double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getcode() {
        return code;
    }

    public String getname() {
        return name;
    }

    public Double getprice() {
        return price;
    }
}
