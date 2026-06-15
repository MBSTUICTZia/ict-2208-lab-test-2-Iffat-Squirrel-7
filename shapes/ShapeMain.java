package shapes;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNext()) {
            String type = sc.next();
            String color = sc.next();
            boolean filled = sc.nextBoolean();

            if (type.equalsIgnoreCase("rectangle")) {
                double width = sc.nextDouble();
                double length = sc.nextDouble();
                
                Rectangle rect = new Rectangle(color, filled, width, length);
                System.out.println(rect);
                
            } else if (type.equalsIgnoreCase("circle")) {
                double radius = sc.nextDouble();
                
                Circle circ = new Circle(color, filled, radius);
                System.out.println(circ);
            }
        }
        sc.close();
    }
}
