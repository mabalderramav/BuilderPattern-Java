package bo.com.nanus.designpatterns.builderpattern.colddrink;

/**
 * Created by ALDO on 15/10/2016.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
