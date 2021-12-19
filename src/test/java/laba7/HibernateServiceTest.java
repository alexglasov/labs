package laba7;

import laba7.hibernate.HibernateSessionService;
import org.junit.Test;

class HibernateServiceTest {
    @Test
    void exec() {
        HibernateSessionService service = new HibernateSessionService();
        service.exec();
    }
}