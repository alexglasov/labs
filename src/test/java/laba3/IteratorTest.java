package laba3;

import laba3.iterator.Item;
import laba3.iterator.ItemType;
import laba3.iterator.Iterator;
import laba3.iterator.TreasureChest;
import org.junit.Test;

public class IteratorTest {
    @Test
    public void test() {
        TreasureChest treasureChest = new TreasureChest();
        Iterator<Item> iterator = treasureChest.iterator(ItemType.ANY);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
