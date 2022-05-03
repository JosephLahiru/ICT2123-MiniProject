/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ict2123.miniproject;
import java.sql.*;
/**
 *
 * @author Joseph Rasanjana
 */
public class SetupDB{

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "";
        String query1 = "CREATE DATABASE ICT2123;";
        String query5 = "use ICT2123;";
//        String query2 = ";";
//        String query3 = "UPDATE student SET name='suvimal' WHERE id='1';";
//        String query4 = "DELETE FROM student WHERE id='1';";

        // register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create connection
        Connection conn = DriverManager.getConnection(url, user, password);
        if(conn != null)
            System.out.println("Connected");

        //Insert data into db
        Statement st1 = conn.createStatement();
        int rowsInserted = st1.executeUpdate(query5);

        if(rowsInserted > 0){
            System.out.println("Databse selected sucessfully.");
        }else{
            System.out.println("Databse selected failed.");
        }

//        //Display Values in database
//        Statement st2 = conn.createStatement();
//        ResultSet result2 = st2.executeQuery(query2);
//
//        while(result2.next()){
//            int id = result2.getInt("id");
//            String name = result2.getString("name");
//            int age = result2.getInt("age");
//
//            System.out.println("ID : " + id);
//            System.out.println("Name : " + name);
//            System.out.println("Age : " + age);
//        }
//
//        //Update values in db
//        PreparedStatement st3 = conn.prepareStatement(query3);
//        int rowsUpdate = st3.executeUpdate();
//
//        if(rowsUpdate > 0){
//            System.out.println("An existed student was updated sucessfully.");
//        }else{
//            System.out.println("Not Updated Sucessfully");
//        }
//
//        System.out.println("\nUpdated Data");
//
//        //Display Values in database
//        Statement st4 = conn.createStatement();
//        ResultSet result4 = st4.executeQuery(query2);
//
//        while(result4.next()){
//            int id = result4.getInt("id");
//            String name = result4.getString("name");
//            int age = result4.getInt("age");
//
//            System.out.println("ID : " + id);
//            System.out.println("Name : " + name);
//            System.out.println("Age : " + age);
//        }

//        //Delete data
//        PreparedStatement st5 = conn.prepareStatement(query4);
//        int rowsDeleted = st5.executeUpdate();
//
//        if(rowsDeleted>0){
//            System.out.println("An existing student have been removed");
//        }
    }
}
