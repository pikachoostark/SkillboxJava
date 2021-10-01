public class Main {
    public static void main(String[] args) {
        int moneyAmount = 180;

        int cappuccinoPrice = 180;
        int lattePrice = 120;
        int espressoPrice = 80;
        int waterPrice = 20;

        boolean canBuyAnything = false;
        boolean isMilkEnough = false;

        if (moneyAmount >= cappuccinoPrice && isMilkEnough) {
            System.out.println("Вы можете купить капучино!");
            canBuyAnything = true;
        }

        if (moneyAmount >= lattePrice && isMilkEnough) {
            System.out.println("Вы можете купить латте!");
            canBuyAnything = true;
        }

        if (moneyAmount >= espressoPrice) {
            System.out.println("Вы можете купить эспрессо!");
            canBuyAnything = true;
        }

        if (moneyAmount >= waterPrice) {
            System.out.println("Вы можете купить воды!");
            canBuyAnything = true;
        }

        if (!canBuyAnything) {
            System.out.println("Недостаточно средств!");
        }
    }
}
