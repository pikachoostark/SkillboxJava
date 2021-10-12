public class Order {
    public void addProduct(Product product) {
        if (product.getPrice() > 50) {
            product.setPrice(product.getPrice() - 25);
        }
    }
}
