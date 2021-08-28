package demo;

public class Stock {
    private int id;
    private String name;
    private int quantity;

    public Stock() {}

    public int getId() {
        return id;
    }
    public int setId() {
        return this.id = id;
    }
    public String getName() {
        return this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public int setQuantity(int id) {
        return this.quantity = id;
    }
}
