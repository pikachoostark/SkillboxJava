public class Arithmetic {
    private int firstVar;
    private int secondVar;

    public Arithmetic(int first, int second) {
        firstVar = first;
        secondVar = second;
    }

    public int summarize() {
        return firstVar + secondVar;
    }

    public int multiply() {
        return firstVar * secondVar;
    }

    public int maxOfNums() {
        return (firstVar > secondVar ? firstVar : secondVar);
    }

    public int minOfNums() {
        return (firstVar < secondVar ? firstVar : secondVar);
    }
}
