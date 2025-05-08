/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;

/**
 *
 * @author DELL
// */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        { 
            Class.forName("com.mysql.cj.jdbc.Driver");
//            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","Mysql@123");
            return con;
        }
        catch(Exception e)
        { 
            System.out.println(e);
            return null;
            
//            Class.forName("com.mysql.jdbc.Driver");
//        jdbc:mysql://localhost:3306/test, or jdbc:mysql://@localhost:3306/test.
//Connection con=DriverManager.getConnection("jdbc:mysql//localhost:3306/lms","root","Mysql@123");

        }
        
        
    }
    
}

