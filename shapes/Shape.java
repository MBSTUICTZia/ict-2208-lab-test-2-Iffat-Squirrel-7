package shapes;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "Color : " + color + "\nFilled: " + (filled ? "Yes" : "No");
    }
}
