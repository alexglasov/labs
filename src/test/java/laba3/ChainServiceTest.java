package laba3;

import laba3.chainOfResponsibility.ChainService;
import laba3.chainOfResponsibility.Request;
import org.junit.Test;

public class ChainServiceTest {
    @Test
    public void test() {
        ChainService chainService = new ChainService();

        Request request = chainService.exec(
                """
                        path: misis.ru
                        session: 2m41t35ad
                        method: POST""");

        System.out.println(request);
    }
}
