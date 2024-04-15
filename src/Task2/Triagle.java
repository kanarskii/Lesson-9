package Task2;

public class Triagle extends Figure{

    private double x;
    private double y;
    private double z;

    public Triagle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double perimeter() {
        return (x + y + z);
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        return (Math.sqrt(p * (p - x) * (p - y) * (p - z)));
    }
}
