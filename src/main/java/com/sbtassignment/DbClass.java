package com.sbtassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbClass {
  private Connection connection;

  public Connection getConnection() {
    return connection;
  }


  DbClass() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      connection = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/calculator", "root", "toor");

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
