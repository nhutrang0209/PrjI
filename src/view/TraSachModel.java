package view;

import java.util.Date;

public class TraSachModel {

    private int madg;
    private String tendg;
    private String tensach;
    private String ngaymuon;
    private int slmuon;
    private int sltra;
    private Date ngaytra;

    public TraSachModel() {
    }

    public TraSachModel(int madg, String tendg, String tensach, String ngaymuon, int slmuon, int sltra, Date ngaytra) {
        this.madg = madg;
        this.tendg = tendg;
        this.tensach = tensach;
        this.ngaymuon = ngaymuon;
        this.slmuon = slmuon;
        this.sltra = sltra;
        this.ngaytra = ngaytra;
    }

    public int getMadg() {
        return madg;
    }

    public void setMadg(int madg) {
        this.madg = madg;
    }

    public String getTendg() {
        return tendg;
    }

    public void setTendg(String tendg) {
        this.tendg = tendg;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(String ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public int getSlmuon() {
        return slmuon;
    }

    public void setSlmuon(int slmuon) {
        this.slmuon = slmuon;
    }

    public int getSltra() {
        return sltra;
    }

    public void setSltra(int sltra) {
        this.sltra = sltra;
    }

    public Date getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(Date ngaytra) {
        this.ngaytra = ngaytra;
    }
    

}
