package bo.com.nanus.designpatterns.builderpattern.burger;

/**
 * Created by ALDO on 15/10/2016.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
