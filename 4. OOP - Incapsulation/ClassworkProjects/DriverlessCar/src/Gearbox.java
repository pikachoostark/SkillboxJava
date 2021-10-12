public class Gearbox {
    /**
     * 0  - neutral
     * -1 - rear
     * 1-6
     */

    // Создадим переменные - пределы передач, чтобы защитить передачу от некорретных значений
    // Строго private, для их безопасности
    private int maxGear = 6;
    private int minGear = 1;
    // Переменная - текущая передача
    private int gear = 0;
    
    // Увеличить передачу
    public void shiftUp() {
        // Если передача уже максимальная, то оставим её как есть
        gear = gear < maxGear ? gear + 1 : gear;
    }

    // Уменьшить передачу
    public void shiftDown() {
        // Если передача уже минимальная, то оставим её как есть
        gear = gear > minGear ? gear - 1 : gear;
    }

    // Переключить на заднюю
    public void switchRear() {
        // Можно только из 0 и -1 (безопасно)
        gear = (gear > 1) ? gear : -1;
    }

    // Переключить на нейтральную
    public void switchNeutral() {
        // Можно с любой передачи
        gear = 0;
    }

    // Геттер текущего значения передачи
    public int getCurrentGear() {
        return gear;
    }
}
