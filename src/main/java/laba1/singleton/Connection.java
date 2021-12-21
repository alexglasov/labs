package laba1.singleton;

public class Connection {
    private static Connection instance;

    public String[] exec(String query) {
        return Connection.execQuery(query);
    }

    public static synchronized Connection getInstance() {
        if (instance == null) {
            init();
        }

        return instance;
    }

    private static void init() {
        instance = new Connection();
    }

    private static synchronized String[] execQuery(String query) {
        return new String[]{"a", "b", "c"};
    }
}
