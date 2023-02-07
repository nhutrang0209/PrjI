/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DateFormat;
import static java.text.DateFormat.getInstance;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 84899
 */
public class PhieuModel {
    private int maphieu;
    private int madg;
    private int masach;
    private int giabia;
    private int soluong;
    private Date ngaymuon;
    private Date ngaydenhan;
    private Date ngaytra;
    
    public PhieuModel(){
        
    }
    
    public PhieuModel(int maphieu,int madg,int masach,int giabia,int soluong,Date ngaymuon,Date ngaytra) {
        this.maphieu=maphieu;
        this.madg=madg;
        this.masach=masach;
        this.giabia=giabia;
        this.soluong=soluong;
        this.ngaymuon=ngaymuon;
        this.ngaytra=ngaytra;
        long a=ngaymuon.getTime()+(long)1000*60*60*24*30;
        this.ngaydenhan=new Date(a);
    }   
                
    /**
     * @return the maphieu
     */
    public int getMaphieu() {
        return maphieu;
    }

    /**
     * @param maphieu the maphieu to set
     */
    public void setMaphieu(int maphieu) {
        this.maphieu = maphieu;
    }

    /**
     * @return the madg
     */
    public int getMadg() {
        return madg;
    }

    /**
     * @param madg the madg to set
     */
    public void setMadg(int madg) {
        this.madg = madg;
    }

    /**
     * @return the masach
     */
    public int getMasach() {
        return masach;
    }

    /**
     * @param masach the masach to set
     */
    public void setMasach(int masach) {
        this.masach = masach;
    }

    /**
     * @return the giabia
     */
    public int getGiabia() {
        return giabia;
    }

    /**
     * @param giabia the giabia to set
     */
    public void setGiabia(int giabia) {
        this.giabia = giabia;
    }

    /**
     * @return the soluong
     */
    public int getSoluong() {
        return soluong;
    }

    /**
     * @param soluong the soluong to set
     */
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    /**
     * @return the ngaymuon
     */
    public Date getNgaymuon() {
        return ngaymuon;
    }

    /**
     * @param ngaymuon the ngaymuon to set
     */
    public void setNgaymuon(Date ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    /**
     * @return the ngaytra
     */
    public Date getNgaytra() {
        return ngaytra;
    }

    /**
     * @param ngaytra the ngaytra to set
     */
    public void setNgaytra(Date ngaytra) {
        this.ngaytra = ngaytra;
    }

    /**
     * @return the ngaydenhan
     */
    public Date getNgaydenhan() {
        return ngaydenhan;
    }

    /**
     * @param ngaydenhan the ngaydenhan to set
     */
    public void setNgaydenhan(Date ngaydenhan) {
        this.ngaydenhan = ngaydenhan;
    }
    
}
