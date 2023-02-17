/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.ConnectDB;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import model.SachModel;
/**
 *
 * @author oOOo
 */
public class SachDao {
    
    
    public static boolean insert(SachModel sach) throws Exception {

        String sql = "INSERT INTO sach( TENSACH, TENTACGIA, NXB,THELOAI, SOLUONG, SOLUONGCONLAI, MAVITRI, GIABIA) VALUES (?,?,?,?,?,?,?,?) ";
        try {
            ConnectDB cn=new ConnectDB();
            Connection conn = (Connection) cn.getConnection();
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, sach.getTensach());
            pstm.setString(2, sach.getTentacgia());
            pstm.setString(3, sach.getNxb());
            pstm.setString(4, sach.getTheloai());
            pstm.setInt(5, sach.getSoluong());
            pstm.setInt(6, sach.getSoluongconlai());
            pstm.setString(7, sach.getMavitri());
            pstm.setInt(8, sach.getGiabia());
            return pstm.executeUpdate() > 0;
        }catch(Exception e){
            return false;
        }
    }
    
    public static boolean update(SachModel sach) throws Exception {
      //  dg.printDg();
        String sql = "UPDATE sach SET TENSACH = ?, TENTACGIA = ?, NXB = ?, THELOAI = ?, "
                + "SOLUONG = ?, SOLUONGCONLAI = ?, MAVITRI = ?, GIABIA =?  WHERE MASACH = ? ";
                ConnectDB cn=new ConnectDB();
                Connection conn = (Connection) cn.getConnection(); 
                PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(9,sach.getMasach());
            pstm.setString(1, sach.getTensach());
            pstm.setString(2, sach.getTentacgia());
            pstm.setString(3, sach.getNxb());
            pstm.setString(4, sach.getTheloai());
            pstm.setInt(5, sach.getSoluong());
            pstm.setInt(6, sach.getSoluongconlai());
            pstm.setString(7, sach.getMavitri());
            pstm.setInt(8, sach.getGiabia());
  
            return pstm.executeUpdate() > 0;

        
    }
    
    public boolean delete(SachModel sach) throws Exception {

        String sql = "DELETE FROM sach WHERE MASACH = ? ";
        try {
                ConnectDB cn = new ConnectDB();
                Connection conn = (Connection) cn.getConnection();
                PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql); 
            pstm.setString(1, sach.getMasach());
            return pstm.executeUpdate() > 0;
        }catch(Exception e){
            return false;
    }
    }
    
    private static SachModel createSach(final ResultSet rs) {
        try{
        SachModel sach = new SachModel();
        sach.setMasach(rs.getString("MASACH"));
        sach.setTensach(rs.getString("TENSACH"));
        sach.setTentacgia(rs.getString("TENTACGIA"));
        sach.setNxb(rs.getString("NXB"));
        sach.setTheloai(rs.getString("THELOAI"));
        sach.setSoluong(rs.getInt("SOLUONG"));
        sach.setSoluongconlai(rs.getInt("SOLUONGCONLAI"));
        sach.setMavitri(rs.getString("MAVITRI"));
        sach.setGiabia(rs.getInt("GIABIA"));
        return sach;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public static List<SachModel> findAll()  {

        String sql = "SELECT * FROM sach";
        try {   
                ConnectDB cn = new ConnectDB();
                Connection conn = (Connection) cn.getConnection();
                PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                List<SachModel> list = new ArrayList<>();
                while (rs.next()) {
                    SachModel sach = createSach(rs);
                    list.add(sach);
                }
                return list;
                }catch(Exception e){
                    return null;  
                        }
    }

        

    public static List<SachModel> findAllByName(String name) {
        String sql = "select * from sach where TENSACH like '%"+name+"%'"  ;
        try {
                ConnectDB cn=new ConnectDB();
                Connection conn = (Connection) cn.getConnection();
                PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
                System.out.println(pstm.toString());
                ResultSet rs = pstm.executeQuery();
                List<SachModel> list = new ArrayList<>();
                while (rs.next()) {
                    SachModel sach = createSach(rs);
                    System.out.println(sach.getTensach());
                    list.add(sach);
                }
                return list;
            }catch(Exception e){
                System.out.println("Co loi");
                return null;
        }
    }
    public static List<SachModel> findAllByAuthor(String author) {
        String sql = "select * from sach where TENTACGIA like '%"+author+"%'"  ;
        try {
                ConnectDB cn=new ConnectDB();
                Connection conn = (Connection) cn.getConnection();
                PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
                System.out.println(pstm.toString());
                ResultSet rs = pstm.executeQuery();
                List<SachModel> list = new ArrayList<>();
                while (rs.next()) {
                    SachModel sach = createSach(rs);
                    System.out.println(sach.getTensach());
                    list.add(sach);
                }
                return list;
            }catch(Exception e){
                System.out.println("Co loi");
                return null;
        }
    }
    public static List<SachModel> findAllByType(String type) {
        String sql = "select * from sach where THELOAI like '%"+type+"%'"  ;
        try {
                ConnectDB cn=new ConnectDB();
                Connection conn = (Connection) cn.getConnection();
                PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
                System.out.println(pstm.toString());
                ResultSet rs = pstm.executeQuery();
                List<SachModel> list = new ArrayList<>();
                while (rs.next()) {
                    SachModel sach = createSach(rs);
                    System.out.println(sach.getTensach());
                    list.add(sach);
                }
                return list;
            }catch(Exception e){
                System.out.println("Co loi o the loai");
                return null;
        }

    }
    
    public static boolean checkSach(String tensach){
        String sql=     "SELECT MASACH FROM sach WHERE TENSACH= ?";
        try{
             ConnectDB cn=new ConnectDB();
                Connection conn=(Connection) cn.getConnection();
                PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
                ps.setString(1, tensach);
                return ps.executeQuery().next();
                
        }
        catch(Exception e){
            
        }
        return false;
    }
}
