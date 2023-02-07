/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import database.ConnectDB;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.PhieuModel;
import view.qtv.MuonsachView;

/**
 *
 * @author 84899
 */
public class PhieuDao {

    
    public static List<PhieuModel> findAllNotReturnedOf(int madg) {
        ConnectDB cn = new ConnectDB();
        Connection conn = cn.getConnection();
        //Tat ca cac phieu chua tra
        List<PhieuModel> list=new ArrayList<PhieuModel>();

        try{
       String sql= "SELECT MAPHIEU, MADG, phieu.MASACH, sach.GIABIA,phieu.SOLUONG, NGAYMUON\n"+
                    "FROM phieu, sach\n" +
                    "WHERE MADG=? AND phieu.MASACH=sach.MASACH \n"+
                    "AND NGAYTRA IS NULL;";
       
        PreparedStatement ps = (PreparedStatement) conn.prepareCall(sql);
        ps.setInt(1, madg);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
                int maphieu=rs.getInt(1);
                //madg da co
                int masach=rs.getInt(3);
                int giabia=rs.getInt(4);
                int soluong=rs.getInt(5);
                Date ngaymuon=rs.getDate(6);
                //Ngay tra chua tra
                PhieuModel phieuModel= new PhieuModel(maphieu,madg,masach,giabia,soluong,ngaymuon,null);
                 list.add(phieuModel);
        }      
            }catch (Exception e) {
        }
        return list;
    }
    public static List<PhieuModel> findAll(int madg) {
        ConnectDB cn = new ConnectDB();
        Connection conn = cn.getConnection();
        //Tat ca cac phieu cua madg
        List<PhieuModel> list=new ArrayList<PhieuModel>();

        try{
       String sql= "SELECT MAPHIEU, MADG, phieu.MASACH, sach.GIABIA,phieu.SOLUONG, NGAYMUON,NGAYTRA\n"+
                    "FROM phieu, sach\n" +
                    "WHERE MADG=? AND phieu.MASACH=sach.MASACH";
        PreparedStatement ps = (PreparedStatement) conn.prepareCall(sql);
        ps.setInt(1, madg);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
                int maphieu=rs.getInt(1);
                //madg da co
                int masach=rs.getInt(3);
                int giabia=rs.getInt(4);
                int soluong=rs.getInt(5);
                Date ngaymuon=rs.getDate(6);
                Date ngaytra =rs.getDate(7);
                PhieuModel phieuModel= new PhieuModel(maphieu,madg,masach,giabia,soluong,ngaymuon,ngaytra);
                 list.add(phieuModel);
        }      
            }catch (Exception e) {
        }
        return list;
    }
    
    public static List<PhieuModel> findA() {
        ConnectDB cn = new ConnectDB();
        Connection conn = cn.getConnection();
        //Tat ca cac phieu cua madg
        List<PhieuModel> list=new ArrayList<PhieuModel>();

        try{
       String sql= "SELECT MAPHIEU, MADG, phieu.MASACH, sach.GIABIA,phieu.SOLUONG, NGAYMUON,NGAYTRA\n"+
                    "FROM phieu, sach\n" +
                    "WHERE phieu.MASACH=sach.MASACH";
        PreparedStatement ps = (PreparedStatement) conn.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
                int maphieu=rs.getInt(1);
                int madg = rs.getInt(2);
                int masach=rs.getInt(3);
                int giabia=rs.getInt(4);
                int soluong=rs.getInt(5);
                Date ngaymuon=rs.getDate(6);
                Date ngaytra =rs.getDate(7);
                PhieuModel phieuModel= new PhieuModel(maphieu,madg,masach,giabia,soluong,ngaymuon,ngaytra);
                 list.add(phieuModel);
        }      
            }catch (Exception e) {
        }
        return list;
    }
    
    public static void muonSach(int madg,int maSach,int num){
        String sql="SELECT CURDATE()";
         try {
                ConnectDB cn = new ConnectDB();
                Connection conn = (Connection) cn.getConnection(); 
                PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
                ResultSet rs=pstm.executeQuery();
                rs.next();
                String date=rs.getString(1);
                sql="CALL muon(?,?,?)";  
                pstm = (PreparedStatement) conn.prepareStatement(sql);
                pstm.setInt(1,madg);
                pstm.setInt(2, maSach);
                pstm.setInt(3, num);    
                //pstm.setString(4,date);
                if(pstm.executeUpdate()>0)         
                    JOptionPane.showMessageDialog(new JFrame(), "Mượn thành công");
                else
                    JOptionPane.showMessageDialog(new JFrame(), "Số lượng sách còn lại không đủ");
         }   catch(SQLException ex){
        System.out.println("Loi truy van");
        JOptionPane.showMessageDialog(new JFrame(), "Mượn không thành công\nLỗi truy vấn", "Warning", JOptionPane.WARNING_MESSAGE);

        Logger.getLogger(MuonsachView.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
}
