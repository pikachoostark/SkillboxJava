public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(90, 60, 90);
        Cargo cargo = new Cargo(dimensions, 50.5, "Russia, Saint Petersgrad",
                false, "112-358-13-21FIB", true);
        System.out.println(cargo + "\n");
        Cargo trueCargo = cargo.setAddress("Russia, Saint Petersburg");
        System.out.println("ИЗВИНИТЕ, ПРОИЗОШЁЛ ТЕХНИЧЕСКИЙ СБОЙ!!!" + "\n" + trueCargo + "\n");
        System.out.println(cargo + "\n" + "БУДЕТ УДАЛЕНА ИЗ СИСТЕМЫ!!!" + "\n");
    }
}
