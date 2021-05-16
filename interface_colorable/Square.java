package interface_colorable;

public class Square extends Rectangle implements Colorable{
    public Square(){};
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLenght(side);
    }
    @Override
    public void setWidth(double width){
        setSide(width);
    }
    @Override
    public void setLenght(double lenght){
        setSide(lenght);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + " are=" + super.getArea()
                + " perimeter=" + super.getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }



    @Override
    public String howToColor() {
        return "Color all four sides..";
    }
}
