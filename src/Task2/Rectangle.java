package Task2;

public class Rectangle extends Figure{

    private double length;
    private double wight;

    public Rectangle(double a, double b) {
        this.length = a;
        this.wight = b;
    }

    @Override
    public double perimeter() {
        return length + wight;
    }

    @Override
    public double area() {
        return length * wight;
    }
}
