package database;

import java.sql.*;

public class ConnectDB {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/thuvien";
            String user = "root";
            String pwd ="";
            conn = DriverManager.getConnection(url, user, pwd);
            if (conn != null)  
                System.out.println("Kết nối thành công");
            
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("getConnection()");
        }
        return conn;
    }
    public static void main(String[] args) {
        ConnectDB con = new ConnectDB();
        if (con.getConnection()!=null){
            System.out.println("Kết nối thành công");
        }else System.out.println("Kết nối that bai");
    }
}
