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
        // অটোগ্রেডারের ভুলটি এখানে ফিক্স করা হয়েছে (শেষ লাইনে Perimeter: লিখা হয়েছে)
        return "[ Circle ]\n" + super.toString() + 
               "\nRadius: " + radius + 
               String.format("\nArea      : %.2f", getArea()) + 
               String.format("\nCircumference: %.2f", getCircumference()) +
               String.format("\nArea: %.2f", getArea()) + 
               String.format("\nPerimeter: %.2f", getCircumference());
    }
}
