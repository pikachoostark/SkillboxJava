import core.*;

import java.util.Scanner;

public class RoadController {
    // Объявление переменных: вещественное число, целое число (x5)
    private static double passengerCarMaxWeight = 3500.0; // kg
    private static int passengerCarMaxHeight = 2000; // mm
    private static int controllerMaxHeight = 3500; // mm

    private static int passengerCarPrice = 100; // RUB
    private static int cargoCarPrice = 250; // RUB
    private static int vehicleAdditionalPrice = 200; // RUB

    public static void main(String[] args) {
        System.out.println("Сколько автомобилей сгенерировать?");

        // Объявление переменных: Сканер, целое число (? Экземпляр класса может считаться переменной ?)
        Scanner scanner = new Scanner(System.in);
        int carsCount = scanner.nextInt();

        for (int i = 0; i < carsCount; i++) {
            // Объявление переменных: Машина
            Car car = Camera.getNextCar();
            System.out.println(car);

            //Пропускаем автомобили спецтранспорта бесплатно
            if (car.isSpecial) {
                openWay();
                continue;
            }

            //Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
            // Объявление переменной: целое число
            int price = calculatePrice(car);
            if (price == -1) {
                continue;
            }

            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }
    }

    /**
     * Расчёт стоимости проезда исходя из массы и высоты
     */
    private static int calculatePrice(Car car) {
        // Объявление переменных: целое число (х2)
        int carHeight = car.height;
        int price = 0;
        // Объявление переменных: вещественное число
        double weight = car.weight;
        if (carHeight > controllerMaxHeight) {
            blockWay("высота вашего ТС превышает высоту пропускного пункта!");
            return -1;
        // Если высота или вес ТС > макс. пасс. => это грузовое ТС
        } else if (weight > passengerCarMaxWeight || carHeight > passengerCarMaxHeight) {
            //Грузовой автомобиль
            price = cargoCarPrice;
        } else { // Иначе это легковое ТС
            //Легковой автомобиль
            price = passengerCarPrice;
        }

        // У любого авто из этих может быть прицеп
        if (car.hasVehicle) {
            price += vehicleAdditionalPrice;
        }

        return price;
    }

    /**
     * Открытие шлагбаума/
     */
    private static void openWay() {
        System.out.println("Шлагбаум открывается... Счастливого пути!");
    }

    /**
     * Сообщение о невозможности проезда
     */
    private static void blockWay(String reason) {
        System.out.println("Проезд невозможен: " + reason);
    }
}