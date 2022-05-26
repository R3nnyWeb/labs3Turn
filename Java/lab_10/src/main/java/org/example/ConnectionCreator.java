package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCreator {
    public  static Connection getNewConnection(String username, String password, String url) throws SQLException {
        return DriverManager.getConnection(url,username,password);
    }
}
