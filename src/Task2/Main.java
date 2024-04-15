package Task2;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triagle(1, 2, 3),
                new Triagle(3, 4, 5),
                new Rectangle(4, 6),
                new Rectangle(5, 7),
                new Circle(6)
        };
        System.out.println(perimetrFigure(figures));

    }

    public static double perimetrFigure(Figure[] figures){
        double sum = 0;
        for(Figure figure: figures){
            sum += figure.perimeter();
        }
        return sum;
    }
}
