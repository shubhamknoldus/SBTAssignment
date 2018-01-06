package com.sbtAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBClass {
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }


    DBClass ()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/calculator","root","toor");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
