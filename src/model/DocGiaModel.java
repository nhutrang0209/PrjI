package model;

import java.util.Date;

public class DocGiaModel {

    private String madg;
    private String tendg;
    private String sodt;
    private String email;
    private String mk;
    private Date ngaysinh;
    private String cancuoccd;
    private String dangmuon;
    private String tienphat;

    public DocGiaModel() {
    }

    public DocGiaModel(String madg, String tendg, String sodt, String email,String mk, Date ngaysinh, String cancuoccd) {
        this.madg = madg;
        this.tendg = tendg;
        this.sodt = sodt;
        this.email = email;
        this.mk=mk;
        this.ngaysinh = ngaysinh;
        this.cancuoccd = cancuoccd;
//        this.dangmuon = dangmuon;
//        this.tienphat = tienphat;
    }

    public String getTendg() {
        return tendg;
    }

    public void setMK(String mk) {
        this.mk = mk;
    }

        public String getMadg() {
        return madg;
    }

    public void setMadg(String madg) {
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
        return cancuoccd;
    }

    public void setCancuoccd(String cancuoccd) {
        this.cancuoccd = cancuoccd;
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
