package dao;

import java.sql.*;
import java.sql.ResultSet;
import database.ConnectDB;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DocGiaModel;

public class DocGiaDao {

    ConnectDB cn = new ConnectDB();
    //private ResultSet rs;


    public boolean insert(DocGiaModel dg) throws Exception {

        String sql = "INSERT INTO DOCGIA ( TENDG, SODT, EMAIL,MK, NGAYSINH, CCCD) VALUES (?,?,?,?,?,?) ";
        try (
                Connection conn = (Connection) cn.getConnection(); PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);) {
            pstm.setString(1, dg.getTendg());
            pstm.setString(2, dg.getSodt());
            pstm.setString(3, dg.getEmail());
            pstm.setString(4, dg.getMK());
            java.sql.Date ngaySinh = new java.sql.Date(dg.getNgaysinh().getTime());
            pstm.setDate(5, ngaySinh);
            pstm.setString(6, dg.getCancuoccd());
            System.out.println(pstm.toString());
            return pstm.executeUpdate() > 0;

        }
    }

    public boolean update(DocGiaModel dg) throws Exception {
        dg.printDg();
        String sql = "UPDATE docgia SET TENDG = ?, SODT = ?, EMAIL = ?, NGAYSINH = ?, CCCD = ? WHERE MADG = ? ";
       
                Connection conn = (Connection) cn.getConnection(); 
                PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setInt(6,dg.getMadg());
            pstm.setString(1, dg.getTendg());
            pstm.setString(2, dg.getSodt());
            pstm.setString(3, dg.getEmail());
            java.sql.Date ngaySinh = new java.sql.Date(dg.getNgaysinh().getTime());
            pstm.setDate(4, ngaySinh);
            pstm.setString(5, dg.getCancuoccd());
            System.out.println("SQL:"+dg.getMadg());
            return pstm.executeUpdate() > 0;

        
    }

    public boolean delete(DocGiaModel dg) throws Exception {

        String sql = "DELETE FROM docgia WHERE MADG = ? ";
        try (
                Connection conn = (Connection) cn.getConnection();
                PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);) {
            pstm.setInt(1, dg.getMadg());
            return pstm.executeUpdate() > 0;

        }
    }

    public DocGiaModel findById(int madg) throws Exception {

        String sql = "SELECT * FROM docgia WHERE MADG = ? ";
        try (
                Connection conn = (Connection) cn.getConnection(); PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);) {
            pstm.setInt(1, madg);
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    DocGiaModel dg = createDocGia(rs);
                    return dg;
                }
            }
            return null;

        }
    }
    public static String getNameByMadg(int madg) throws SQLException{
        String sql="SELECT TENDG FROM docgia WHERE MADG=?";
        ConnectDB cn = new ConnectDB();
        Connection conn = (Connection) cn.getConnection();
        PreparedStatement ps= (PreparedStatement) conn.prepareStatement(sql); 
        ps.setInt(1, madg);
        ResultSet rs=ps.executeQuery();
        rs.next();
        String tendg=rs.getString(1);
        return tendg;
    }

    public static DocGiaModel createDocGia(final ResultSet rs) throws SQLException {
        DocGiaModel dg = new DocGiaModel();
        dg.setMadg(rs.getInt("MADG"));
        dg.setTendg(rs.getString("TENDG"));
        dg.setSodt(rs.getString("SODT"));
        dg.setEmail(rs.getString("EMAIL"));
        dg.setNgaysinh(rs.getDate("NGAYSINH"));
        dg.setCancuoccd(rs.getString("CCCD"));
        return dg;
    }

    public List<DocGiaModel> findAll() throws Exception {

        String sql = "SELECT * FROM docgia";
        try (
                Connection conn = (Connection) cn.getConnection(); PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);) {
            try (ResultSet rs = pstm.executeQuery();) {
                List<DocGiaModel> list = new ArrayList<>();
                while (rs.next()) {
                    DocGiaModel dg = createDocGia(rs);
                    list.add(dg);
                }
                return list;
            }

        }

    }
    
    public static DocGiaModel findByMadg(int madg){
        String sql=     "SELECT * FROM docgia WHERE MADG="+madg;
        System.out.println(sql);
        try {
                ConnectDB cn=new ConnectDB();
                Connection conn=(Connection) cn.getConnection();
                PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
                ResultSet rs=ps.executeQuery();
                rs.next();
                DocGiaModel dg=createDocGia(rs);
                return dg;
        }catch(Exception e){
            return null;}
        
    }
}
