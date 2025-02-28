package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {

    public int compare(Item o1, Item o2) {
        return o1.getName().compareTo(o2.getName());
    }


}
