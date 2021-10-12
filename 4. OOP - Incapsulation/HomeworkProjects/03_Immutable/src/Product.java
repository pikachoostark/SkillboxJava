public class Product {
    private String name;
    private int price;
    private final int barCode;

    public Product(String name, int barCode) {
        this.name = name;
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBarCode() {
        return barCode;
    }
}
