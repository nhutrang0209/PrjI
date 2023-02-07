/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import database.ConnectDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



/**
 *
 * @author 84899
 */
public class LoginDao {
    
    public static int findAdminByEmailAndPassword(String email,String password){
        String sql=     "SELECT * FROM qtv WHERE EMAIL=? AND MK=?";
        try {
                ConnectDB cn=new ConnectDB();
                Connection conn=(Connection) cn.getConnection();
                PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
                ps.setString(1,email);
                ps.setString(2, password);
                ResultSet rs=ps.executeQuery();
                rs.next();
                try{
                    int maqtv=rs.getInt(1);
                    return maqtv;
                }catch(Exception e ){
                    return 0;
                }
        }catch(Exception e){
            return 0;
        }
    }
    
    public static int findUserByEmailAndPassword(String email,String password){
        String sql=     "SELECT * FROM docgia WHERE EMAIL=? AND MK=?";
        try {
                ConnectDB cn=new ConnectDB();
                Connection conn=(Connection) cn.getConnection();
                PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
                ps.setString(1,email);
                ps.setString(2, password);
                ResultSet rs=ps.executeQuery();
                rs.next();
                try{
                    int madg=rs.getInt(1);
                    return madg;
                }catch(Exception e ){
                    return 0;
                }
        }catch(Exception e){
            return 0;
        }
    }
    public static int findUserByEmail(String email){
        String sql=     "SELECT * FROM docgia WHERE EMAIL=?";
        try {
                ConnectDB cn=new ConnectDB();
                Connection conn=(Connection) cn.getConnection();
                PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
                ps.setString(1,email);
                ResultSet rs=ps.executeQuery();
                rs.next();
                try{
                    int madg=rs.getInt(1);
                    return madg;
                }catch(Exception e ){
                    return 0;
                }
        }catch(Exception e){
            return 0;
        }
    }
    public static void changePass(int madg,String newPass){
        try {
                String sql="UPDATE docgia SET MK=? WHERE MADG=?";
                ConnectDB cn=new ConnectDB();
                Connection conn=(Connection) cn.getConnection();
                PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
                ps.setString(1,newPass);
                ps.setInt(2,madg);
                ps.executeUpdate();
        }catch(Exception e){
            return ;
        }
    }
   
}
