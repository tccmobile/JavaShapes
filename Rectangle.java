class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(double x, double y, double width, double height, String color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle at (" + x + "," + y + 
                         ") with width " + width + " and height " + height);
    }
    
    @Override
    public double calculateArea() {
        return width * height;
    }
    
    // Rectangle-specific getters
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
}