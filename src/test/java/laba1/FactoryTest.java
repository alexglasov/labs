package laba1;

import laba1.factory.DialogManager;
import org.junit.Test;

public class FactoryTest {
    @Test
    public void test() {
        DialogManager dialogManager = new DialogManager();
        dialogManager.configure();
        dialogManager.render();
    }
}
