import java.util.Locale;

public class ShapeMain {
    public static void main(String[] args) {
        
        Rectangle rectObj = new Rectangle("Red", true, 4.0, 5.0);
        Circle circObj = new Circle("Blue", false, 3.0);

        
        Object[] shapes = new Object[2];
        shapes[0] = rectObj;
        shapes[1] = circObj;

        
        for (Object shape : shapes) {
            System.out.println(shape);
            System.out.println();
        }

        
        System.out.println("--- Downcast Check ---");
        for (Object shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle rect = (Rectangle) shape; 
                System.out.printf(Locale.US, "Rectangle width=%.1f length=%.1f\n", rect.getWidth(), rect.getLength());
            } else if (shape instanceof Circle) {
                Circle circ = (Circle) shape; 
                System.out.printf(Locale.US, "Circle radius=%.1f\n", circ.getRadius());
            }
        }
    }
}