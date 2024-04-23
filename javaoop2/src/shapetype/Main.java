package shapetype;


public class Main {
    public static void main(String[] args) {
        // Create instances of each shape using the ShapeType enum
        Shape circle = createShape(ShapeType.CIRCLE, "Circle", 5.0);
        Shape rectangle = createShape(ShapeType.RECTANGLE, "Rectangle", 4.0, 6.0);
        Shape triangle = createShape(ShapeType.TRIANGLE, "Triangle", 3.0, 4.0);

        // Calculate and print areas and perimeters
        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);
    }

    // Factory method to create shapes based on the ShapeType enum
    public static Shape createShape(ShapeType type, String name, double... params) {
        switch (type) {
            case CIRCLE:
                return new Circle(name, params[0]);
            case RECTANGLE:
                return new Rectangle(name, params[0], params[1]);
            case TRIANGLE:
                return new Triangle(name, params[0], params[1]);
            default:
                System.err.println("Invalid ShapeType");
                return null;
        }
    }

    // Helper method to print shape information
    public static void printShapeInfo(Shape shape) {
        System.out.println("Shape: " + shape.name);
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println();
    }
}
