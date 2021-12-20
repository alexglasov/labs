package laba6;

import laba6.database.DatabaseService;
import org.junit.Test;

public class DatabaseServiceTest {
    @Test
    public void test() {
        DatabaseService service = new DatabaseService();
        service.exec();
    }
}
