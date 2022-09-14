package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
    private final static String PATH = "jdbc:mysql://localhost:3306/mydb?serverTimezone=Europe/Moscow";
    private final static String LOGIN = "root";
    private final static String PASSWORD = "root";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(PATH, LOGIN, PASSWORD);
    }

    public static SessionFactory sessionFactory () {
        Properties properties = new Properties();
        properties.setProperty("hibernate.connection.url", PATH);
        properties.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");
        properties.setProperty("hibernate.connection.username", LOGIN);
        properties.setProperty("hibernate.connection.password", PASSWORD);
        properties.setProperty("hibernate.connection.driver_class", DRIVER);
        properties.setProperty("show_sql", "true");

        SessionFactory sessionFactory = new Configuration()
                .addProperties(properties)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        return sessionFactory;
    }


}
