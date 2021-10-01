public class Main {
    public static void main(String[] args) {
        int maryAge = 25;
        int johnAge = 22;
        int gabrielAge = 18;

        int minimum, middle, maximum;
        if (maryAge <= johnAge) {
            if (maryAge <= gabrielAge) {
                minimum = maryAge;
                if (johnAge <= gabrielAge) {
                    middle = johnAge;
                    maximum = gabrielAge;
                } else {
                    middle = gabrielAge;
                    maximum = johnAge;
                }
            } else {
                minimum = gabrielAge;
                middle = maryAge;
                maximum = johnAge;
            }
        } else {
            if (johnAge <= gabrielAge) {
                minimum = johnAge;
                if (maryAge <= gabrielAge) {
                    middle = maryAge;
                    maximum = gabrielAge;
                } else {
                    middle = gabrielAge;
                    maximum = maryAge;
                }
            } else {
                minimum = gabrielAge;
                middle = johnAge;
                maximum = maryAge;
            }
        }

        System.out.println("Минимальный возраст: " + minimum + "\nСредний возраст: " +
                middle + "\nМаксимальный возраст: " + maximum);
    }
}
