public class Dimensions {
    private final int height;
    private final int width;
    private final int length;

    public Dimensions(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int countVolume() {
        return height * width * length;
    }

    public String toString() {
        return height + "x" + width + "x" + length;
    }
}
