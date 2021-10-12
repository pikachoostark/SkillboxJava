public class Cargo {
    private final Dimensions dimensions;
    private final double mass;
    private final String address;
    private final boolean canBeFlipped;
    private final String regNumber;
    private final boolean isFragile;

    public Cargo(Dimensions dimensions, double mass, String address,
                 boolean canBeFlipped, String regNumber, boolean isFragile) {
        this.dimensions = dimensions;
        this.mass = mass;
        this.address = address;
        this.canBeFlipped = canBeFlipped;
        this.regNumber = regNumber;
        this.isFragile = isFragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getMass() {
        return mass;
    }

    public String getAddress() {
        return address;
    }

    public boolean isCanBeFlipped() {
        return canBeFlipped;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public Cargo setAddress(String address) {
        return new Cargo (dimensions, mass, address, canBeFlipped, regNumber, isFragile);
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo (dimensions, mass, address, canBeFlipped, regNumber, isFragile);
    }

    public Cargo setMass(double mass) {
        return new Cargo (dimensions, mass, address, canBeFlipped, regNumber, isFragile);
    }

    public String toString() {
        return "Посылка №" + regNumber + '\n' +
                "Габариты: " + dimensions + '\n' +
                "Масса: " + mass + " Объём: " + dimensions.countVolume() + '\n' +
                "Должна быть отправлена по адресу: " + address + '\n' +
                (isFragile ? "Осторожно!" : "");
    }
}
