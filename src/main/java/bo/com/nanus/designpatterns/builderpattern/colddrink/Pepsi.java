package bo.com.nanus.designpatterns.builderpattern.colddrink;

/**
 * Created by ALDO on 15/10/2016.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.5f;
    }
}
