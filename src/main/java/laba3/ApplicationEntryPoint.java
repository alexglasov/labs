package laba3;

import laba3.chainOfResponsibility.ChainService;
import laba3.chainOfResponsibility.Request;
import laba3.iterator.Item;
import laba3.iterator.ItemType;
import laba3.iterator.Iterator;
import laba3.iterator.TreasureChest;
import laba3.strategy.CommaSeparatedStrategy;
import laba3.strategy.SemicolonSeparatedStrategy;
import laba3.strategy.StringJoiner;

import java.util.Arrays;

public class ApplicationEntryPoint {
    public static void main(String[] args) {
        doMain();
    }

    static void doMain() {
        testChainService();
        testStrategy();
        testIterator();
    }

    static void testChainService() {
        ChainService chainService = new ChainService();

        Request request = chainService.exec(
                """
                        path: misis.ru
                        session: 2m41t35ad
                        method: POST""");

        System.out.println(request);
    }

    static void testStrategy() {
        StringJoiner stringJoiner = new StringJoiner(new CommaSeparatedStrategy());

        String result = stringJoiner.exec(Arrays.asList("blah", "blah", "blah"));

        System.out.println(result);

        stringJoiner.setStrategy(new SemicolonSeparatedStrategy());

        result = stringJoiner.exec(Arrays.asList("blah", "blah", "blah"));

        System.out.println(result);
    }

    static public void testIterator() {
        TreasureChest treasureChest = new TreasureChest();
        Iterator<Item> iterator = treasureChest.iterator(ItemType.ANY);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
