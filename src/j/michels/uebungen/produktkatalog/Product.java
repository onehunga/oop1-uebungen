package j.michels.uebungen.produktkatalog;

public class Product {
    private double price;
    private String name;
    private String desc;

    public Product(double price, String name, String desc) {
        this.price = price;
        this.name = name;
        this.desc = desc;
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
