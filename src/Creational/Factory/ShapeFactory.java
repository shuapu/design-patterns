package Creational.Factory;

public class ShapeFactory {

    public static Shape shape(ShapeType shapeType) {
        Shape shape;
        switch (shapeType) {
            case CIRCLE:
                shape= new Circle();
                break;
            case RECTANGLE:
                shape= new Rectangle();
                break;
            case TRIANGLE:
                shape= new Triangle();
                break;
            default:
                throw new  IllegalArgumentException("Provided shape is not supported");
        }
        return shape;
    }
}
