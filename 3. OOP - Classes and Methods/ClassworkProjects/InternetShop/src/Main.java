public class Main {
    public static void main(String[] args) {
        Basket johnBasket = new Basket(100);
        johnBasket.add("Колбаса", 76);
        johnBasket.add("Молоко", 55);
        Basket kateBasket = new Basket();
        kateBasket.add("Лопата", 1560);
        kateBasket.add("Бочка", 2135);
        johnBasket.print("Корзина Джона");
        kateBasket.print("Корзина Кейт");
        Basket annBasket = new Basket("Стол", 5000); // Не добавили цену, но по факту - сработало
        annBasket.print("Корзина Энн");
    }
}
