public class Country {
    private String name;
    private int population;
    private double square; // km^2
    private String capitalName;
    private boolean isSeaAccess;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public boolean isSeaAccess() {
        return isSeaAccess;
    }

    public void setSeaAccess(boolean seaAccess) {
        isSeaAccess = seaAccess;
    }
}
