import java.util.Scanner;

public class Main {
    private static int minIncome = 200000; // Объявление целочисленной переменной - мин. прибыль
    private static int maxIncome = 900000; // Объявление целочисленной переменной - макс. прибыль

    private static int officeRentCharge = 140000; // Объявление целочисленной переменной - плата за аренду офиса
    private static int telephonyCharge = 12000; // Объявление целочисленной переменной - плата за телефон
    private static int internetAccessCharge = 7200; // Объявление целочисленной переменной - плата за Интернет

    private static int assistantSalary = 45000; // Объявление целочисленной переменной - зарплата помощника
    private static int financeManagerSalary = 90000; // // Объявление целочисленной переменной - з/п фин. менеджера

    private static double mainTaxPercent = 0.24; // Объявление вещественной переменной - основной % налога
    private static double managerPercent = 0.15; // Объявление вещественной переменной - % менеджера

    private static double minInvestmentsAmount = 100000; // Объявление вещественной переменной - мин. кол-во инвестиций

    public static void main(String[] args) {
        int breakEvenPoint = (int) Math.ceil((minInvestmentsAmount + calculateFixedCharges() * (1 - mainTaxPercent)) /
                (1 - mainTaxPercent + managerPercent * mainTaxPercent - managerPercent));
        System.out.println("Точка безубыточности компании: " + breakEvenPoint);
        while (true) { // Запускаем бесконечный цикл
            System.out.println("Введите сумму доходов компании за месяц " +
                "(от 200 до 900 тысяч рублей): "); // Вывод строки в консоль
            int income = (new Scanner(System.in)).nextInt(); // Считываем ввод в новую целочисленную переменную

            if (!checkIncomeRange(income)) { // Если доход вне диапазона - не идём дальше
                continue; // Перезапуск цикла
            }

            double managerSalary = income * managerPercent; // Считаем з/п менеджера
            double pureIncome = income - managerSalary -
                calculateFixedCharges(); // Чистый доход = доход - з/п менеджера - остальные расходы
            double taxAmount = mainTaxPercent * pureIncome; // налог
            double pureIncomeAfterTax = pureIncome - taxAmount; // доход за вычетом налогов

            boolean canMakeInvestments = pureIncomeAfterTax >=
                minInvestmentsAmount; // можно ли инвестировать - превышает ли чистый доход мин. допустимые инвестиции

            System.out.println("Зарплата менеджера: " + managerSalary); // выводим з/п менеджера
            System.out.println("Общая сумма налогов: " +
                (taxAmount > 0 ? taxAmount : 0)); // Выводим налог, если он есть
            System.out.println("Компания может инвестировать: " +
                (canMakeInvestments ? "да" : "нет")); // Отвечаем на вопрос, можно ли компании инвестировать
            if (pureIncome < 0) {
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!"); // Находится ли компания в убытке?
            }
        }
    }

    private static boolean checkIncomeRange(int income) { // В этом методе считаем, входит ли доход в допустимый диапазон
        if (income < minIncome) {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if (income > maxIncome) {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true;
    }

    private static int calculateFixedCharges() { // В этом методе считаем фиксированные расходы
        return officeRentCharge +
            telephonyCharge +
            internetAccessCharge +
            assistantSalary +
            financeManagerSalary;
    }
}
