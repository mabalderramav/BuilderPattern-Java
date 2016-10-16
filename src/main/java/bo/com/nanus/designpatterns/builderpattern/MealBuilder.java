package bo.com.nanus.designpatterns.builderpattern;

import bo.com.nanus.designpatterns.builderpattern.burger.ChickenBurger;
import bo.com.nanus.designpatterns.builderpattern.burger.VegBurger;
import bo.com.nanus.designpatterns.builderpattern.colddrink.Coke;
import bo.com.nanus.designpatterns.builderpattern.colddrink.Pepsi;

/**
 * This class is director builder.
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
