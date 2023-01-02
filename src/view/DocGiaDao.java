package view;

import java.sql.*;
import java.sql.ResultSet;
import database.ConnectDB;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import view.DocGiaModel;

public class DocGiaDao {

    ConnectDB cn = new ConnectDB();
    //private ResultSet rs;
    public List<DocGiaModel> list;

    public boolean insert(DocGiaModel dg) throws Exception {

        String sql = "INSERT INTO docgia (MADOCGIA, TENDOCGIA, SODT, EMAIL, NGAYSINH, CCCD, DANGMUON, TIENPHAT) VALUES (?,?,?,?,?,?,?,?) ";
        try (
                Connection conn = (Connection) cn.getConnection(); PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);) {
            pstm.setString(1, dg.getMadg());
            pstm.setString(2, dg.getTendg());
            pstm.setString(3, dg.getSodt());
            pstm.setString(4, dg.getEmail());
            java.sql.Date ngaySinh = new java.sql.Date(dg.getNgaysinh().getTime());
            pstm.setDate(5, ngaySinh);
            pstm.setString(6, dg.getCancuoccd());
            pstm.setString(7, dg.getDangmuon());
            pstm.setString(8, dg.getTienphat());
            return pstm.executeUpdate() > 0;

        }
    }

    public boolean update(DocGiaModel dg) throws Exception {
        dg.printDg();
        String sql = "UPDATE docgia SET TENDOCGIA = ?, SODT = ?, EMAIL = ?, NGAYSINH = ?, CCCD = ? WHERE MADOCGIA = ? ";
       
                Connection conn = (Connection) cn.getConnection(); 
                PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
        //    pstm.setString(8, dg.getMadg());
            pstm.setString(1, dg.getTendg());
            pstm.setString(2, dg.getSodt());
            pstm.setString(3, dg.getEmail());
            java.sql.Date ngaySinh = new java.sql.Date(dg.getNgaysinh().getTime());
            pstm.setDate(4, ngaySinh);
            pstm.setString(5, dg.getCancuoccd());
            pstm.setString(6, dg.getMadg());
         //   pstm.setString(7, dg.getTienphat());
            System.out.println("SQL:"+pstm);
            return pstm.executeUpdate() > 0;

        
    }

    public boolean delete(DocGiaModel dg) throws Exception {

        String sql = "DELETE FROM docgia WHERE MADOCGIA = ? ";
        try (
                Connection conn = (Connection) cn.getConnection();
                PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);) {
            pstm.setString(1, dg.getMadg());
            return pstm.executeUpdate() > 0;

        }
    }

    public DocGiaModel findById(String madg) throws Exception {

        String sql = "SELECT * FROM docgia WHERE MADOCGIA = ? ";
        try (
                Connection conn = (Connection) cn.getConnection(); PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);) {
            pstm.setString(1, madg);
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    DocGiaModel dg = createDocGia(rs);
                    return dg;
                }
            }
            return null;

        }
    }

    private DocGiaModel createDocGia(final ResultSet rs) throws SQLException {
        DocGiaModel dg = new DocGiaModel();
        dg.setMadg(rs.getString("MADOCGIA"));
        dg.setTendg(rs.getString("TENDOCGIA"));
        dg.setSodt(rs.getString("SODT"));
        dg.setEmail(rs.getString("EMAIL"));
        dg.setNgaysinh(rs.getDate("NGAYSINH"));
        dg.setCancuoccd(rs.getString("CCCD"));
        dg.setDangmuon(rs.getString("DANGMUON"));
        dg.setTienphat(rs.getString("TIENPHAT"));
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
}
