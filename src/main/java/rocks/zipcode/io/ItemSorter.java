package rocks.zipcode.io;

import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    Item[] items;
    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        Arrays.sort(items, comparator);
        return items;
    }
}
