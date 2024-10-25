public class Main {
    public static void main(String[] args) {
        // Create some shapes
        Circle circle = new Circle(0, 0, 5, "red");
        Rectangle rectangle = new Rectangle(2, 3, 4, 6, "blue");
        
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
