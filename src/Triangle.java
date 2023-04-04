public class Triangle extends Shape {

    private double side;
    private double height;
    private final double KOEF = 0.5;

    public Triangle (double side, double height){
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double area = KOEF * height * side;
        return area;
    }
}