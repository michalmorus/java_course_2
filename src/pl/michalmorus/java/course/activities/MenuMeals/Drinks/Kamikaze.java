package pl.michalmorus.java.course.activities.MenuMeals.Drinks;

public class Kamikaze implements Drink {
    @Override
    public String getName() {
        return "Kamikaze shot";
    }

    @Override
    public Double getPrice() {
        return 12.5;
    }

    @Override
    public Double getCapacity() {
        return 50.0;
    }
}
