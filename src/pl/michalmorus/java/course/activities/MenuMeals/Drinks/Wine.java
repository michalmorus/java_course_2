package pl.michalmorus.java.course.activities.MenuMeals.Drinks;

public class Wine implements Drink {
    @Override
    public String getName() {
        return "Wine";
    }

    @Override
    public Double getPrice() {
        return 8.2;
    }
    @Override
    public Double getCapacity() {
        return 80.0;
    }
}
