package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {

    private static final String URL = "jdbc:mysql://localhost/kata_schema";
    private static final String USER = "user1";
    private static final String PASSWORD = "rootROOT8";

    public static Connection getConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Ошибка соединения");
            throw new RuntimeException(e);
        }
        return connection;
    }

}
