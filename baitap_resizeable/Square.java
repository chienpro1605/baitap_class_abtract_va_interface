package baitap_resizeable;

public class Square extends Shape{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return side*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getSide() + "các thuộc tính kế thừa:"+
                super.toString()+"Area = "+getArea()+
                '}';
    }

    @Override
    public void resize(double percent) {
        this.side = (percent/200);

    }
}
