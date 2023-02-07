package model;

import java.util.Date;

public class DocGiaModel {

    private int madg;
    private String tendg;
    private String sodt;
    private String email;
    private String mk;
    private Date ngaysinh;
    private String cccd;
    private String dangmuon;
    private String tienphat;

    public DocGiaModel() {
    }

    public DocGiaModel(int madg, String tendg, String sodt, String email,String mk, Date ngaysinh, String cancuoccd) {
        this.madg = madg;
        this.tendg = tendg;
        this.sodt = sodt;
        this.email = email;
        this.mk=mk;
        this.ngaysinh = ngaysinh;
        this.cccd = cccd;
//        this.dangmuon = dangmuon;
//        this.tienphat = tienphat;
    }

    public String getTendg() {
        return tendg;
    }

    public void setMK(String mk) {
        this.mk = mk;
    }

        public int getMadg() {
        return madg;
    }

    public void setMadg(int madg) {
        this.madg = madg;
    }

    public String getMK() {
        return mk;
    }

    public void setTendg(String tendg) {
        this.tendg = tendg;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getCancuoccd() {
        return cccd;
    }

    public void setCancuoccd(String cancuoccd) {
        this.cccd = cancuoccd;
    }

    public String getDangmuon() {
        return dangmuon;
    }

    public void setDangmuon(String dangmuon) {
        this.dangmuon = dangmuon;
    }

    public String getTienphat() {
        return tienphat;
    }

    public void setTienphat(String tienphat) {
        this.tienphat = tienphat;
    }

    public void printDg(){
        System.out.println("MADG: "+getMadg()+"\n"+
                           "Ten: "+getTendg()+"\n"+
                           "Email: "+getEmail()+"\n"+
                            "CCCD: "+getCancuoccd()+"\n"+
                            "Ngay: "+getNgaysinh()+"\n");
    }
    
}
