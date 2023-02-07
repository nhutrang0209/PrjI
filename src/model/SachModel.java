/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author 84899
 */
public class SachModel {
    private String masach;
    private String tensach;
    private String tentacgia;
    private String nxb;
    private String theloai;
    private String soluong;
    private String soluongconlai;
    private String mavitri;
    private int giabia;
    public SachModel() {
    }

    public SachModel(String masach, String tensach, String tentacgia, String nxb, String theloai, String soluong, String soluongconlai, String mavitri) {
        this.masach = masach;
        this.tensach = tensach;
        this.tentacgia = tentacgia;
        this.nxb = nxb;
        this.theloai = theloai;
        this.soluong = soluong;
        this.soluongconlai = soluongconlai;
        this.mavitri = mavitri;
    }

    
    
    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getSoluongconlai() {
        return soluongconlai;
    }

    public void setSoluongconlai(String soluongconlai) {
        this.soluongconlai = soluongconlai;
    }

    public String getMavitri() {
        return mavitri;
    }

    public void setMavitri(String mavitri) {
        this.mavitri = mavitri;
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
 
    
}

