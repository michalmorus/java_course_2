package pl.michalmorus.java.course.activities.MenuMeals;

import pl.michalmorus.java.course.activities.MenuMeals.Drinks.Cola;
import pl.michalmorus.java.course.activities.MenuMeals.Drinks.Drink;
import pl.michalmorus.java.course.activities.MenuMeals.Drinks.OrangeJuice;
import pl.michalmorus.java.course.activities.MenuMeals.Drinks.Tea;
import pl.michalmorus.java.course.activities.MenuMeals.Meals.Chicken;
import pl.michalmorus.java.course.activities.MenuMeals.Meals.Meal;
import pl.michalmorus.java.course.activities.MenuMeals.Meals.Pizza;

public class ChildrenMealsFactory implements MenuMealsAbstractFactory {
    @Override
    public Drink[] buildDrinkProducts() {
        return new Drink[]{
            new Tea(),
            new Cola(),
            new OrangeJuice()
        };
    }

    @Override
    public Meal[] buildMealsProducts() {
        return new Meal[]{
            new Pizza(),
            new Chicken()
        };
    }
}
