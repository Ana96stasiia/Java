package homework1;

public class Cat {
    String name;
    String color;
    int age;
    public void voice () {
        System.out.println("meow!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
