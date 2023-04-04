public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = PI * (radius * radius);
        return area;
    }
}
