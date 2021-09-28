public class Main {
    public static void main(String[] args) {
        System.out.println("Система управления заправочной колонкой");

        int fuelType = 97;   // тип топлива
        int amount = 990;     // количество топлива, в литрах
        int maxAmount = 420; // максимально допустимое количество топлива, в литрах

        double fuelPrice = 0.0;     // цена топлива, в рублях
        double fuel92Price = 62.75; // цена 92 типа топлива, в рублях
        double fuel95Price = 75.60; // цена 95 типа топлива, в рублях

        if (fuelType == 92) {
            fuelPrice = fuel92Price;
        } else if (fuelType == 95) {
            fuelPrice = fuel95Price;
        } else {
            System.out.println("ОШИБКА!!! Введён некорректный тип топлива");
        }

        if (amount < 1) {
            System.out.println("ОШИБКА!!! Введено некорректно значение топлива");
            amount = 0;
        }

        if (amount > maxAmount)  {
            System.out.println("ОШИБКА!!! Превышено максимально возможное количество топлива");
            amount = 0;
        }

        double totalPrice = fuelPrice * amount;

        System.out.println("Было заправлено " + amount + " литров топлива.");
        System.out.println("Цена на данное топливо составляет " + fuelPrice + " руб.");
        System.out.println("Общая стоимость заправки составила " + totalPrice + " руб.");
    }
}
