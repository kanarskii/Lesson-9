package Task2;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return (2 * Math.PI * radius);
    }

    @Override
    public double area() {
        return (Math.pow(radius,2) * Math.PI);
    }
}
