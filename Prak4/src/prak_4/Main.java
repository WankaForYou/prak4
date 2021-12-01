package prak_4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3, "red", true);
        Rectangle rectangle = new Rectangle(3, 4, "blue", false);
        Square square = new Square(5, "green", true);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
