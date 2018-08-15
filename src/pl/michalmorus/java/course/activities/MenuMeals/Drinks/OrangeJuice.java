package pl.michalmorus.java.course.activities.MenuMeals.Drinks;

public class OrangeJuice implements Drink {
    @Override
    public String getName() {
        return "Orange juice";
    }

    @Override
    public Double getPrice() {
        return 1.5;
    }

    @Override
    public Double getCapacity() {
        return 250.0;
    }
}
