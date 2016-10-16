package bo.com.nanus.designpatterns.builderpattern.burger;

import bo.com.nanus.designpatterns.builderpattern.Item;
import bo.com.nanus.designpatterns.builderpattern.packing.Packing;
import bo.com.nanus.designpatterns.builderpattern.packing.Wrapper;

/**
 * Created by ALDO on 15/10/2016.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
