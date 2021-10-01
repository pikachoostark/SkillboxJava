public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = x++;

        System.out.println("y = " + y + "; x = " + x + ";" );

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int age = 15; age < 40; age++) {
            System.out.print(age + " лет - Вы можете: ");
            if (age <= 15) {
                System.out.print("жить обычной жизнью");
            }
            if (age >= 16 && age < 18) {
                System.out.print("иметь ученические права");
            }
            if (age >= 18) {
                System.out.print("иметь обычные права");
            }
            if (age >= 35) {
                System.out.print(", баллотироваться в президенты РФ, ");
            }
            System.out.println();
        }
    }
}
