package laba1;

import laba1.singleton.Connection;
import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class SingletonTest {
    @Test
    public void test() {
        Connection connection = Connection.getInstance();
        Objects.requireNonNull(connection);

        if (!Arrays.equals(connection.exec(""), new String[]{"a", "b", "c"})) {
            throw new RuntimeException("failed test!");
        }
    }
}
