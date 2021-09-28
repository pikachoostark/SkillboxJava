public class Main {
    public static void main(String[] args) {
        // Приложение, эмулирующее работу системы заправочной колонки
        System.out.println("Система расчёта стоимости топлива");

        // Объявление целочисленых переменных
        int fuelType = 95; // тип топлива (92, 95)
        int amount = 50; // литры

        // Объявление вещественных переменных
        double fuel92Price = 60.20; // рубли
        double fuel95Price = 67.33; // рубли

        double fuelPrice = 0; // рубли

        // Выбор цены топлива в зависимости от его типа
        if (fuelType == 92) {
            fuelPrice = fuel92Price;
        }
        else if (fuelType == 95) {
            fuelPrice = fuel95Price;
        } else {
            System.out.println("ОШИБКА! Выбран неверный тип топлива!");
        }

        if (amount < 1) {
            System.out.println("ОШИБКА! Указано слишком малое количество топлива!");
            // Чтобы в этом случае цена отобразилась корректно обнулим количество топлива
            amount = 0;
        }
        System.out.println("Цена выбранного топлива: " + fuelPrice + " руб.");

        double totalPrice = fuelPrice * amount; // рубли
        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");
    }
}
