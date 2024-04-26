package shapetype;

public class Main2 {
    public static void main(String[] args) {
        //krijojm objektet e cdo klase
        Shape circle=createShape(ShapeType.CIRCLE,"Circle",2.3);
        Shape rectangle=createShape(ShapeType.RECTANGLE,"Rectangle",6,4.5);
        Shape triangle=createShape(ShapeType.TRIANGLE,"Triangle",3,4.5);
        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);
    }


    public static Shape createShape(ShapeType shapeType, String name, double... params) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle(name, params[0]);
            case RECTANGLE:
                return  new Rectangle(name,params[0],params[1]);
            case TRIANGLE:
                return  new Triangle(name,params[0],params[1]);
            default:
                System.err.println("Invalid shape type ");
                return null;
        }
    }

    //metode ndihmese per te printuar te dhenat e shape
    public static void printShapeInfo(Shape shape) {
        System.out.println("Shape : " + shape.name);
        System.out.println("Area : " + shape.calculateArea());
        System.out.println("Perimeter : " + shape.calculatePerimeter());
        System.out.println();
    }
}
