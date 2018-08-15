package pl.michalmorus.java.course.activities.MenuMeals;

import pl.michalmorus.java.course.activities.MenuMeals.Drinks.Drink;
import pl.michalmorus.java.course.activities.MenuMeals.Meals.Meal;

public class Client {
    MenuMealsAbstractFactory factory;
    Client(MenuMealsAbstractFactory factory) {
        this.factory = factory;
    }

    void show() {
        Drink[] drinks = factory.buildDrinkProducts();
        Meal[] meals = factory.buildMealsProducts();
        for (Drink drink : drinks) {
            System.out.println(drink.getName() + " " + drink.getCapacity() + "ml " + drink.getPrice() + "zł");
        }
        for (Meal meal : meals) {
            System.out.println(meal.getName() + " " + meal.getWeight() + "g " + meal.getPrice() + " zł");
        }
    }
}
