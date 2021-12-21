package laba3;

import laba3.strategy.CommaSeparatedStrategy;
import laba3.strategy.SemicolonSeparatedStrategy;
import laba3.strategy.StringJoiner;
import org.junit.Test;

import java.util.Arrays;

public class StrategyTest {
    @Test
    public void test() {
        StringJoiner stringJoiner = new StringJoiner(new CommaSeparatedStrategy());

        String result = stringJoiner.exec(Arrays.asList("blah", "blah", "blah"));

        System.out.println(result);

        stringJoiner.setStrategy(new SemicolonSeparatedStrategy());

        result = stringJoiner.exec(Arrays.asList("blah", "blah", "blah"));

        System.out.println(result);
    }
}
