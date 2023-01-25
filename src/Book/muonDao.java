/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

import database.DatabaseHelper;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

/**
 *
 * @author oOOo
 */
public class muonDao {
    public boolean insert(muon m) throws Exception{
        String sql = "insert into muon( MADOCGIA, TENDOCGIA, TENSACH, SOLUONGMUON, NGAYMUON) values(?,?,?,?,?)";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
             pstmt.setInt(1, m.getMadocgia());
              pstmt.setString(2, m.getTendocgia());
               pstmt.setString(3, m.getTensach());
                pstmt.setInt(4, m.getSoluongmuon());
                 SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
                 String date = sdf.format(m.getNgaymuon());
                   pstmt.setString(5, date);
                   return pstmt.executeUpdate() > 0;
        }
    }
}
