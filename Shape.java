abstract class Shape implements Drawable {
    protected String color;
    protected double x;
    protected double y;
    
    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String getColor() {
        return color;
    }
    
    public abstract double calculateArea();
    
    public void moveShape(double deltaX, double deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }
}
