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
    
    ConnectDB cn = new ConnectDB();
    Connection conn;
    private DefaultTableModel tblModel;
    
    public boolean insert(SachModel sach) throws Exception {

        String sql = "INSERT INTO sach( TENSACH, TENTACGIA, NXB,THELOAI, SOLUONG, SOLUONGCONLAI, MAVITRI) VALUES (?,?,?,?,?,?,?) ";
        try (
                Connection conn = (Connection) cn.getConnection(); PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);) {
            pstm.setString(1, sach.getTensach());
            pstm.setString(2, sach.getTentacgia());
            pstm.setString(3, sach.getNxb());
            pstm.setString(4, sach.getTheloai());
            pstm.setString(5, sach.getSoluong());
            pstm.setString(6, sach.getSoluongconlai());
            pstm.setString(7, sach.getMavitri());
            return pstm.executeUpdate() > 0;

        }
    }
    
    public boolean update(SachModel sach) throws Exception {
      //  dg.printDg();
        String sql = "UPDATE sach SET TENSACH = ?, TENTACGIA = ?, NXB = ?, THELOAI = ?, "
                + "SOLUONG = ?, SOLUONGCONLAI = ?, MAVITRI = ?  WHERE MASACH = ? ";
       
                Connection conn = (Connection) cn.getConnection(); 
                PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(8,sach.getMasach());
            pstm.setString(1, sach.getTensach());
            pstm.setString(2, sach.getTentacgia());
            pstm.setString(3, sach.getNxb());
            pstm.setString(4, sach.getTheloai());
            pstm.setString(5, sach.getSoluong());
            pstm.setString(6, sach.getSoluongconlai());
            pstm.setString(7, sach.getMavitri());
  
            return pstm.executeUpdate() > 0;

        
    }
    
    public boolean delete(SachModel sach) throws Exception {

        String sql = "DELETE FROM sach WHERE MASACH = ? ";
        try (
                Connection conn = (Connection) cn.getConnection();
                PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);) {
            pstm.setString(1, sach.getMasach());
            return pstm.executeUpdate() > 0;

        }
    }
    
    private SachModel createSach(final ResultSet rs) throws SQLException {
        SachModel sach = new SachModel();
        sach.setMasach(rs.getString("MASACH"));
        sach.setTensach(rs.getString("TENSACH"));
        sach.setTentacgia(rs.getString("TENTACGIA"));
        sach.setNxb(rs.getString("NXB"));
        sach.setTheloai(rs.getString("THELOAI"));
        sach.setSoluong(rs.getString("SOLUONG"));
        sach.setSoluongconlai(rs.getString("SOLUONGCONLAI"));
        sach.setMavitri(rs.getString("MAVITRI"));
        return sach;
    }
    
    public List<SachModel> findAll() throws Exception {

        String sql = "SELECT * FROM sach";
        try (
                Connection conn = (Connection) cn.getConnection(); PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);) {
            try (ResultSet rs = pstm.executeQuery();) {
                List<SachModel> list = new ArrayList<>();
                while (rs.next()) {
                    SachModel sach = createSach(rs);
                    list.add(sach);
                }
                return list;
            }

        }

    }
    
}
