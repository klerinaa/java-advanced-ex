package shapetype;

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        // Assuming this is a right-angled triangle.
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }
}
