package dao;

import java.sql.*;
import database.ConnectDB;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.TraSachModel;

/**
 *
 * @author Thanh Nguyen
 */
public class TraSachDao {

    ConnectDB cn = new ConnectDB();

    public boolean tra(TraSachModel tr) throws Exception {
        String sql = "INSERT INTO bangtra(MADOCGIA, TENDOCGIA, TENSACH, SOLUONGMUON, NGAYMUON, SOLUONGTRA, NGAYTRA) VALUES (?,?,?,?,?,?,?)";
        try {
                Connection conn = cn.getConnection(); 
                PreparedStatement pstm = conn.prepareStatement(sql); 
            pstm.setInt(1, tr.getMadg());
            pstm.setString(2, tr.getTendg());
            pstm.setString(3, tr.getTensach());
            pstm.setInt(4, tr.getSlmuon());
            pstm.setString(5, tr.getNgaymuon());
            pstm.setInt(6, tr.getSltra());
            java.sql.Date ngaytra = new java.sql.Date(tr.getNgaytra().getTime());
            pstm.setDate(7, ngaytra);
            return pstm.executeUpdate() > 0;
        } catch(Exception e){
            
        }   
            return false;
        }
        public static void trasach(int maPhieu, int soSachHong){
            
        try {
            String sql = "CALL trasach(?,?);";
            ConnectDB cn = new ConnectDB();
            Connection conn = cn.getConnection();
            PreparedStatement ps;
            ps = (PreparedStatement) conn.prepareCall(sql);
             ps.setInt(1,maPhieu);
                 ps.setInt(2, soSachHong);
            if(ps.executeUpdate()>0) System.out.println("Trả sách thành công");
        
        } catch (SQLException ex) {
            Logger.getLogger(TraSachDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
}