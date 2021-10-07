public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 5);
        basket.add("Butter", 85, 0.3);
        basket.add("Watermelon", 44, 2, 12.56);
        basket.print("Test Basket");
        System.out.println(basket.getTotalWeight());
        System.out.println(basket.getTotalPrice());

        Arithmetic arithmetic = new Arithmetic(10, 55);
        System.out.println(arithmetic.summarize());
        System.out.println(arithmetic.multiply());
        System.out.println(arithmetic.maxOfNums());
        System.out.println(arithmetic.minOfNums());

        Printer printer = new Printer();
        printer.append("Жили-были два бобра...", "Бобриная сказка", 31);
        printer.append("Ну и что, что здесь нет заголовка?", 17);
        System.out.println(printer.getTotalPendingPagesCount());
        System.out.println(printer.getPendingPagesCount());
        printer.print();
        printer.append("Откуда мне знать сколько здесь страниц?",
                "Я написал текст и заголовок, но не считал страницы");
        printer.append("СТАНДАРТНАЯ ПРОВЕРКА ПРИНТЕРА");
        printer.print();
        System.out.println(printer.getTotalPendingPagesCount());
        System.out.println(printer.getPendingPagesCount());
    }
}
