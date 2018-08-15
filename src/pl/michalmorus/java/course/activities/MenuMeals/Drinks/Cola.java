package pl.michalmorus.java.course.activities.MenuMeals.Drinks;

public class Cola implements Drink {
    @Override
    public String getName() {
        return "Cola";
    }

    @Override
    public Double getPrice() {
        return 2.10;
    }

    @Override
    public Double getCapacity() {
        return 120.0;
    }
}
