package Day09.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circleArea = new Circle(5);
        System.out.println(circleArea.calculateArea());

        Rectangle RecrangleArea = new Rectangle(2, 3);
        System.out.println(RecrangleArea.calculateArea());

        Triangle triangleArea = new Triangle(3,5);
        System.out.println(triangleArea.calculateArea());
    }
}
