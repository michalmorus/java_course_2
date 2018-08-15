package pl.michalmorus.java.course.activities.MenuMeals;

import pl.michalmorus.java.course.activities.MenuMeals.Drinks.*;
import pl.michalmorus.java.course.activities.MenuMeals.Meals.Chicken;
import pl.michalmorus.java.course.activities.MenuMeals.Meals.Meal;
import pl.michalmorus.java.course.activities.MenuMeals.Meals.Pizza;
import pl.michalmorus.java.course.activities.MenuMeals.Meals.Spaggetti;

public class AdultMealsFactory implements MenuMealsAbstractFactory {
    @Override
    public Drink[] buildDrinkProducts() {
        return new Drink[]{
                new Tea(),
                new Cola(),
                new OrangeJuice(),
                new Wine(),
                new Kamikaze()
        };
    }

    @Override
    public Meal[] buildMealsProducts() {
        return new Meal[]{
                new Pizza(),
                new Chicken(),
                new Spaggetti()
        };
    }
}
