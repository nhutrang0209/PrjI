/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

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
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author oOOo
 */
public class SachDao {
    
    ConnectDB cn = new ConnectDB();
    Connection conn;
    private DefaultTableModel tblModel;
    
    public boolean insert(Sach s) throws Exception{
         conn = cn.getConnection();
        String sql = "insert into sach(MASACH, TENSACH, TENTACGIA, TENNXB,  THELOAI, SOLUONG, SOLUONGCONLAI, SOTRANG, MAVITRI) values(?,?,?,?,?,?,?,?,?)";
        try(
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ){
            pstmt.setString(1, s.getId());
             pstmt.setString(2, s.getName());
              pstmt.setString(3, s.getAuthor());
              pstmt.setString(4, s.getPublisher());
               pstmt.setString(5, s.getCategory());
                pstmt.setInt(6, s.getNumber());
                 pstmt.setInt(7, s.getAvailable());
                  pstmt.setInt(8, s.getNumber_pages());
                   pstmt.setString(9, s.getLocation_id());
                   
                   return pstmt.executeUpdate() > 0;
        }
    }
    
}
