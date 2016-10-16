package bo.com.nanus.designpatterns.builderpattern.burger;

/**
 * Created by ALDO on 15/10/2016.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
