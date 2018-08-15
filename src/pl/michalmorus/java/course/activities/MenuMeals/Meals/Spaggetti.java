package pl.michalmorus.java.course.activities.MenuMeals.Meals;

public class Spaggetti implements Meal {
    @Override
    public String getName() {
        return "Spagetti";
    }

    @Override
    public Double getPrice() {
        return 14.0;
    }

    @Override
    public Double getWeight() {
        return 400.0;
    }
}
