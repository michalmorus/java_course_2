package pl.michalmorus.java.course.activities.MenuMeals.Drinks;

public class Tea implements Drink {
    @Override
    public String getName() {
        return "Tea";
    }

    @Override
    public Double getPrice() {
        return 3.2;
    }

    @Override
    public Double getCapacity() {
        return 125.0;
    }
}
