package interface_colorable;

public class mainchaytest {
    public static void main(String[] args) {


        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Rectangle();

        for (Shape shape : shapes){
            System.out.println(shape);
            if (shape instanceof Square ){
                Colorable colorable = (Square) shape;
                System.out.println(((Square) shape).howToColor());
            }
        }

    }
}
