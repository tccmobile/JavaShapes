public class Main {
    public static void main(String[] args) {
        // Create some shapes
        Circle circle = new Circle(0, 0, 5, "red");
        Rectangle rectangle = new Rectangle(2, 3, 4, 6, "blue");
        Shape[] shapes = new Shape[2];
        Drawable[] drawables = new Drawable[2];
        
        drawables[0] = circle;
        drawables[1] = rectangle;

        System.out.println("First Demo - Drawable Array\n\n");
        for (Drawable drawable : drawables) {
            drawable.draw();
            drawable.setColor("green");
            System.out.println("Color: " + drawable.getColor());
         //   System.out.println("Area: " + drawable.calculateArea()); Not possible
        }

        System.out.println("\n\nNext Demo - Shape Array\n\n");
        shapes[0] = circle;

        shapes[1] = rectangle;


        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("Area: " + shape.calculateArea());
        }

        System.out.println("\n\nOriginal work\n\n");
        // Use interface methods
        circle.draw();
        rectangle.draw();
       

        // Use abstract class methods
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        
        // Move shapes
        circle.moveShape(1, 1);
        rectangle.moveShape(-1, 2);
        
        // Draw again after moving
        circle.draw();
        rectangle.draw();
        
        // Use shape-specific methods
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Rectangle dimensions: " + rectangle.getWidth() + 
                         " x " + rectangle.getHeight());
    }
}
