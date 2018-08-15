package pl.michalmorus.java.course.activities.MenuMeals.Meals;

public class Pizza implements Meal {
    @Override
    public String getName() {
        return "Pizza";
    }

    @Override
    public Double getPrice() {
        return 21.0;
    }

    @Override
    public Double getWeight() {
        return 280.0;
    }
}
