public class Company {
    private final String name;
    private final BankDetails bankDetails;

    public Company(String name, BankDetails bankDetails) {
        this.name = name;
        this.bankDetails = bankDetails;
    }

    public String getName() {
        return name;
    }

    public BankDetails getBankDetails() {
        return bankDetails;
    }

    public String toString() {
        return name + "\n" + bankDetails;
    }
}
