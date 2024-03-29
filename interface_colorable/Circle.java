package interface_colorable;

public class Circle extends Shape{
    private double radius = 1;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPremeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                +" and area=" + getArea()
                + " perimeter=" + getPremeter()
                + ", which is a subclass of "
                + super.toString();
    }
}
