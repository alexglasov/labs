package laba7;

import laba7.hibernate.HibernateSessionService;
import org.junit.Test;

public class HibernateServiceTest {
    @Test
    public void test() {
        HibernateSessionService service = new HibernateSessionService();
        service.exec();
    }
}
