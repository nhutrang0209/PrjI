/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author oOOo
 */
public class DatabaseHelper {
    public static Connection openConnection() throws Exception{
        String url = "jdbc:mysql://localhost/quanlysach";
        var user = "root";
        var password = "";
             Connection con = DriverManager.getConnection(url, user, password);
            return con;
    }
}