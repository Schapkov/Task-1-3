package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final static String PATH = "jdbc:mysql://localhost:3306/myDb?serverTimezone=Europe/Moscow";
    private final static String LOGIN = "root";
    private final static String PASSWORD = "root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(PATH, LOGIN, PASSWORD);
    }
}
