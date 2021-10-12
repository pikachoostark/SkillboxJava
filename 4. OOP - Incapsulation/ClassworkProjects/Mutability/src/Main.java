public class Main {
    public static void main(String[] args) {
//        Product a = new Product("Молоко", 56);
//        Product b = a;
//
//        a.setName("Сок");
//
//        System.out.println(a.toString());
//        System.out.println(b.toString());
//
//        Order order = new Order();
//        order.addProduct(a);
//
//        System.out.println(a);

        BankDetails details = new BankDetails("438076083475346346",
                "N/A", "N/A", "N/A", "N/A");
        Company company = new Company("Смарт-Экспресс", details);
        System.out.println(company);
        // ...
        details.setBillNumber("124091345023523523");
        System.out.println(company); // Расчётный счёт изменился, хотя он и final в классе Company.
                                     // Потому что объект BankDetails - один в памяти.
    }
}
