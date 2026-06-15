import java.util.Locale;

public class Rectangle {
    protected String color;
    protected boolean filled;
    private double width;
    private double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        this.color = color;
        this.filled = filled;
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "[ Rectangle ]\n" + 
               "Color : " + color + "\nFilled: " + (filled ? "Yes" : "No") + 
               String.format(Locale.US, "\nWidth : %.1f\nLength: %.1f\nArea      : %.2f\nPerimeter : %.2f", 
               width, length, getArea(), getPerimeter());
    }
}