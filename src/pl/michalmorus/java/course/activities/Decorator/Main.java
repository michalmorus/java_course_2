package pl.michalmorus.java.course.activities.Decorator;

public class Main {
    public static void main(String[] args) throws Exception {

        ClassA a = new ClassA();
        Decorator decorator = new Decorator(a);
        System.out.println(a.getSomething());
        System.out.println(decorator.getSomething());
    }
}
