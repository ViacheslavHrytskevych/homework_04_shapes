public class Main {

    public static void main(String[] args) {

        Shape[] shapes = {new Square(5), new Circle(5), new Triangle(5, 6)};

        double sum = sumAreas(shapes);

        System.out.println("The sum of the areas of the figures is " + sum + " sq cm.");
    }

    static double sumAreas(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            sum += shapes[i].calculateArea();
        }
            return sum;
        }
}