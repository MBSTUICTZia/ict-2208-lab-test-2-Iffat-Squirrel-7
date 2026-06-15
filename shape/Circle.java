import java.util.Locale;

public class Circle {
    protected String color;
    protected boolean filled;
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "[ Circle ]\n" + 
               "Color : " + color + "\nFilled: " + (filled ? "Yes" : "No") + 
               String.format(Locale.US, "\nRadius: %.1f\nArea      : %.2f\nCircumference: %.2f", 
               radius, getArea(), getCircumference());
    }
}