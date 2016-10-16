package bo.com.nanus.designpatterns.builderpattern.colddrink;

import bo.com.nanus.designpatterns.builderpattern.packing.Bottle;
import bo.com.nanus.designpatterns.builderpattern.Item;
import bo.com.nanus.designpatterns.builderpattern.packing.Packing;

/**
 * Created by ALDO on 15/10/2016.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
