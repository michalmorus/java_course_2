package pl.michalmorus.java.course.activities.MenuMeals;

import pl.michalmorus.java.course.activities.MenuMeals.Drinks.Drink;
import pl.michalmorus.java.course.activities.MenuMeals.Meals.Meal;

interface MenuMealsAbstractFactory {

    Drink[] buildDrinkProducts();

    Meal[] buildMealsProducts();

}
