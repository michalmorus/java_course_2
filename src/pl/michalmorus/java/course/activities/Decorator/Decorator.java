package pl.michalmorus.java.course.activities.Decorator;

public class Decorator extends ClassA {
    private ClassA a;

    public Decorator(ClassA classA) {
        this.a = classA;
    }

    @Override
    public String getSomething() {
        String a = this.a.getSomething();
        return " " + a + "  i jeszcze coś";
    }
}
