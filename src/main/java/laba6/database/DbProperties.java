package laba6.database;

import laba7.props.ApplicationProperties;

import java.util.Properties;

public class DbProperties {
    private static final String URL = "database.url";
    private static final String USER = "database.user";
    private static final String PASSWORD = "database.password";

    private static DbProperties INSTANSE;

    private String url;
    private String user;
    private String password;

    private DbProperties() {
        // No-op.
    }

    private void init(Properties properties) {
        url = properties.getProperty(URL);
        user = properties.getProperty(USER);
        password = properties.getProperty(PASSWORD);
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public static DbProperties getProperties() {
        if (INSTANSE == null) {
            INSTANSE = new DbProperties();
            INSTANSE.init(ApplicationProperties.getInstance().getProperties());
        }

        return INSTANSE;
    }
}