package bo.com.nanus.designpatterns.builderpattern;

import org.junit.Assert;
import org.junit.Test;

/**
 * this class is test.
 */
public class MealBuilderTest {
    private MealBuilder mealBuilder;

    public MealBuilderTest() {
        mealBuilder = new MealBuilder();
    }

    @Test
    public void prepareVegMeal() {
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        final float expected = 55.0f;
        final float actual = vegMeal.getCost();
        System.out.println("Total Cost: " + actual);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void prepareNonVegMeal() {
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        final float expected = 86.0f;
        final float actual = nonVegMeal.getCost();
        System.out.println("Total Cost: " + actual);
        Assert.assertEquals(expected, actual, 0);
    }
}
