class Circle extends Shape {
    private double radius;
    
    public Circle(double x, double y, double radius, String color) {
        super(x, y, color);
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle at (" + x + "," + y + 
                         ") with radius " + radius);
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    // Circle-specific getter
    public double getRadius() {
        return radius;
    }
}