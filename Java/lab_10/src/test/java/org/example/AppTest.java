package org.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;


public class AppTest
{
    final String USERNAME = "root";
    final String PASSWORD = "root";
    final String URL = "jdbc:mysql://localhost:3306/lab10";
    private static Connection connection;
    @Before
    public void init() throws SQLException {
        connection =ConnectionCreator.getNewConnection(USERNAME, PASSWORD, URL);
    }
    @After
    public void close() throws SQLException {
        connection.close();
    }
    @Test
    public void getConnectionTest() throws SQLException {
    try(Connection connection = ConnectionCreator.getNewConnection(USERNAME, PASSWORD, URL)) {
        assertTrue(connection.isValid(1));
        assertFalse(connection.isClosed());
    }
    }


}
