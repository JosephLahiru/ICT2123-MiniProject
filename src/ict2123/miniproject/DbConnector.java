package ict2123.miniproject;

import java.sql.*;

public class DbConnector {

    private void registerConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver registration error !!!");
        }
    }

    public Connection getConnection() {
        registerConnection();
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/_ICT2123";
        //localhost:3306
        String user = "admin";
        String password = "adminpwd";

        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            System.out.println("Getting Connection Error !!!");
            System.out.println(ex);
        }

        return conn;
    }

}
