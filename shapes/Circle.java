package shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "[ Circle ]\n" + super.toString() + 
               "\nRadius: " + radius + 
               String.format("\nArea      : %.2f", getArea()) + 
               String.format("\nCircumference: %.2f", getCircumference());
    }
}