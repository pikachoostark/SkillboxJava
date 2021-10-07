public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int limit;

    // Ещё один конструктор, необходимый для того, чтобы сохранить возможность создавать экземпляры класса без параметров
    public Basket() {
        items = "Список товаров: ";
        this.limit = 1_000_000_000;
    }

    // Конструктор
    public Basket(int limit) {
        this(); // Чтобы переменную items забрать из первого конструктора
        this.limit = limit;
    }

    // Конструктор для создания корзины с предварительно сохранённым списком товаров
    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    // Перегрузка:
    public void add(String name, int price, int count) {
        if (contains(name)) {
            return;
        }
        if (totalPrice + count * price >= limit) {
            return;
        }
        items += name + " - " +
                price + " руб." +
                count + "шт. " + "\n";
        totalPrice += count * price;

    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void print(String title) {
        System.out.println(title);
        if(items.isEmpty()) {
            System.out.println("Корзина пуста!");
        } else {
            System.out.println(items);
        }
    }
}
