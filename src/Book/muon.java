/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

import java.util.Date;

/**
 *
 * @author oOOo
 */
public class muon {
    private int maphieu;
    private int madocgia;
    private String tendocgia;
    private String tensach;
    private int masach;
    private int soluongmuon;
    private int soluongtra;
    private int soluongchuatra;
    private Date ngaymuon;
    private Date ngaytra;
    public muon() {
    }

    public muon(int maphieu, int madocgia, String tendocgia, String tensach, int masach, int soluongmuon, int soluongtra, int soluongchuatra, Date ngaymuon, Date ngaytra) {
        this.maphieu = maphieu;
        this.madocgia = madocgia;
        this.tendocgia = tendocgia;
        this.tensach = tensach;
        this.masach = masach;
        this.soluongmuon = soluongmuon;
        this.soluongtra = soluongtra;
        this.soluongchuatra = soluongchuatra;
        this.ngaymuon = ngaymuon;
        this.ngaytra = ngaytra;
    }

    public int getMaphieu() {
        return maphieu;
    }

    public void setMaphieu(int maphieu) {
        this.maphieu = maphieu;
    }

    public int getMadocgia() {
        return madocgia;
    }

    public void setMadocgia(int madocgia) {
        this.madocgia = madocgia;
    }

    public String getTendocgia() {
        return tendocgia;
    }

    public void setTendocgia(String tendocgia) {
        this.tendocgia = tendocgia;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public int getSoluongmuon() {
        return soluongmuon;
    }

    public void setSoluongmuon(int soluongmuon) {
        this.soluongmuon = soluongmuon;
    }

    public int getSoluongtra() {
        return soluongtra;
    }

    public void setSoluongtra(int soluongtra) {
        this.soluongtra = soluongtra;
    }

    public int getSoluongchuatra() {
        return soluongchuatra;
    }

    public void setSoluongchuatra(int soluongchuatra) {
        this.soluongchuatra = soluongchuatra;
    }

    public Date getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(Date ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public Date getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(Date ngaytra) {
        this.ngaytra = ngaytra;
    }

    
}
