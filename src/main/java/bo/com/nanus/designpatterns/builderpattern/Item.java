package bo.com.nanus.designpatterns.builderpattern;

import bo.com.nanus.designpatterns.builderpattern.packing.Packing;

/**
 * This class is Item that obtain the Packing class.
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
