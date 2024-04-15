package Task1;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Booker booker = new Booker();
        director.info();
        worker.info();
        booker.info();
    }
}
