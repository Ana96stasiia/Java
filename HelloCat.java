package homework1;

public class HelloCat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name="Tom";
        cat.color="black";
        cat.age=7;
        cat.voice();
        System.out.println(cat);
        Cat cat2 = new Cat();
        cat2.name="Lucy";
        cat2.color="white";
        cat2.age=5;
        cat2.voice();
        System.out.println(cat2);
    }
}
