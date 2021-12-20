package laba6.database;

import org.jetbrains.annotations.NotNull;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseService {
    public void exec() {
        DbProperties properties = DbProperties.getProperties();

        try (Connection connection = DriverManager.getConnection(
                properties.getUrl(),
                properties.getUser(),
                properties.getPassword()
        )) {
            getStudents(connection);
            addStudent(connection);
            updateStudent(connection);
            transaction(connection);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void getStudents(@NotNull Connection connection) throws SQLException {
        String query = "SELECT * FROM student";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            try (ResultSet result = statement.executeQuery()) {
                while (result.next()) {
                    System.out.println("id: " + result.getInt("id") +
                            ", name: " + result.getString("name") +
                            ", surname: " + result.getString("surname") +
                            ", group_id: " + result.getString("group_id")
                    );
                }
            }
        }
    }

    private void addStudent(@NotNull Connection connection) throws SQLException {
        String query = "INSERT INTO student (name, surname, group_id) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, "Александр");
            statement.setString(2, "Петров");
            statement.setLong(3, 1);
            statement.executeUpdate();
        }
    }

    private void updateStudent(@NotNull Connection connection) throws SQLException {
        String query = "UPDATE student SET name = ? WHERE id = ?";
        try(PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, "Александр Третий");
            statement.setLong(2, 5);
            statement.execute();
        }
    }

    private void transaction(@NotNull Connection connection) throws SQLException {
        String query = "UPDATE student SET name = ? WHERE id = ?";
        connection.setAutoCommit(false);
        try(PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, "Сергей непонятный");
            statement.setLong(2, 6);
            statement.execute();

            String example = null;
            example.toString();
            connection.commit();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            connection.rollback();
        } finally {
            connection.setAutoCommit(true);
        }
    }
}
