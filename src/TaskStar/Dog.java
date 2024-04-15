package TaskStar;

public class Dog implements Cloneable{
    private String name;
    private  int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info(){
        System.out.println("Эту собаку зовут " + name + ", ей " + age + " лет");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Dog clone() throws CloneNotSupportedException {
        return (Dog)super.clone();
    }
}
