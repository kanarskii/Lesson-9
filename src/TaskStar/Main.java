package TaskStar;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Dog dog1 = new Dog("Bim", 5);
        Dog dog2 = dog1.clone();
        dog1.setAge(4);
        dog1.info();
        dog2.info();
    }
}
