package Creational.Factory;

public class MainClass {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.shape(ShapeType.CIRCLE);
        circle.draw();
        Shape rectangle = ShapeFactory.shape(ShapeType.RECTANGLE);
        rectangle.draw();
        Shape triangle = ShapeFactory.shape(ShapeType.TRIANGLE);
        triangle.draw();
    }
}
