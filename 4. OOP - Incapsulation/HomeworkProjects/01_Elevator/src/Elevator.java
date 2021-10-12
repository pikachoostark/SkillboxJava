public class Elevator {
    private int currentFloor = 1;
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    private void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
        System.out.println("Текущий этаж: " + currentFloor);
    }

    private void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
        System.out.println("Текущий этаж: " + currentFloor);
    }

    public void move(int floor) {
        if (floor == currentFloor) {
            return;
        } else if ((floor >= minFloor) & (floor <= maxFloor)) {
            while (currentFloor != floor) {
                if (currentFloor < floor) {
                    moveUp();
                } else {
                    moveDown();
                }
            }
        } else {
            System.out.println("Ошибка! Пожалуйста, укажите верный номер этажа!");
        }
    }
}
