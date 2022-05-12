package ict2123.miniproject;
import java.sql.*;

public class SetupDB{

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/ict2123";
        String user = "root";
        String password = "";
//        String query1 = "CREATE DATABASE ICT2123;";
//        String query5 = "use ICT2123;";
        String query2 = "CREATE TABLE technical_officer(id INT PRIMARY KEY AUTO_INCREMENT, first_name VARCHAR(30), last_name VARCHAR(30),"
                + "password VARCHAR(60), address VARCHAR(60), email VARCHAR(40), "
                + "dob date, contact_number VARCHAR(11), gender CHAR(1));";
        
//        String query3 = "UPDATE student SET name='suvimal' WHERE id='1';";
//        String query4 = "DELETE FROM student WHERE id='1';";

//        String query3 = "SELECT * FROM user WHERE first_name='kamal'";

        // register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create connection
        Connection conn = DriverManager.getConnection(url, user, password);
        if(conn != null)
            System.out.println("Connected");

        //Insert data into db
        Statement st1 = conn.createStatement();
        
        if(!st1.execute(query2)){
            System.out.println("table sucessfully.");
        }else{
            System.out.println("Databse selected failed.");
        }
        
//        Statement st2 = conn.createStatement();
//        int rowsInserted2 = st2.executeUpdate(query2);
//
//        if(rowsInserted2 > 0){
//            System.out.println("User table created sucessfully.");
//        }else{
//            System.out.println("User table creation failed.");
//        }

        //Display Values in database
//        Statement st2 = conn.createStatement();
//        ResultSet result2 = st2.executeQuery(query3);
//
//        while(result2.next()){
//            int id = result2.getInt("id");
//            String name = result2.getString("first_name");
//            String pwd = result2.getString("password");
//
//            System.out.println("ID : " + id);
//            System.out.println("Name : " + name);
//            System.out.println("Pwd : " + pwd);
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
