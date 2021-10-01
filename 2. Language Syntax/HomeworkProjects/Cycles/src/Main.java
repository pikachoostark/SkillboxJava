public class Main {
    public static void main(String[] args) {
        for (int ticket = 200000; ticket <= 235000; ticket++) {
            System.out.println("Номер билета: " + ticket);
            if (ticket == 210000) {
                ticket += 10000-1;
            }
        }

        int anotherTicket = 200000;
        while (anotherTicket <= 235000) {
            System.out.println("Номер абсолютно другого билета: " + anotherTicket);
            if (anotherTicket == 210000) {
                anotherTicket += 10000-1;
            }
            anotherTicket++;
        }
    }
}
