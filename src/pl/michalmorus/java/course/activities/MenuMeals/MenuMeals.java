package pl.michalmorus.java.course.activities.MenuMeals;

public class MenuMeals {

    public static void run() {
        System.out.println("dziecko");
        Client children = new Client(new ChildrenMealsFactory());
        children.show();
        System.out.println("dorosły");
        Client adult = new Client(new AdultMealsFactory());
        adult.show();
    }
}
