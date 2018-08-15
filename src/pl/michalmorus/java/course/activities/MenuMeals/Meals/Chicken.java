package pl.michalmorus.java.course.activities.MenuMeals.Meals;

public class Chicken implements Meal {
    @Override
    public String getName() {
        return "Chicken";
    }

    @Override
    public Double getPrice() {
        return 18.0;
    }

    @Override
    public Double getWeight() {
        return 300.0;
    }
}
