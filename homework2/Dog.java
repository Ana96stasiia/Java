package homework2;

public class Dog extends Animals {
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println("gaf-gaf!");
    }
}
