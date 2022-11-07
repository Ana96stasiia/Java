package homework2;

public class Animals {
    private String name;
    private String color;
    private int age;

    public Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void voice() {
        System.out.println("unknown!");
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
