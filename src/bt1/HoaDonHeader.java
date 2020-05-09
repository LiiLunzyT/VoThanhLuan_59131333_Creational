/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class HoaDonHeader {
    String maHD;
    String tenKH;
    Date ngayBsan;

    public HoaDonHeader() {
    }

    public HoaDonHeader(String maHD, String tenKH, Date ngayBsan) {
        this.maHD = maHD;
        this.tenKH = tenKH;
        this.ngayBsan = ngayBsan;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + "maHD=" + maHD + ", tenKH=" + tenKH + ", ngayBsan=" + ngayBsan + '}';
    }

    public String getMaHD() {
        return maHD;
    }

    public String getTenKH() {
        return tenKH;
    }

    public Date getNgayBsan() {
        return ngayBsan;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public void setNgayBsan(Date ngayBsan) {
        this.ngayBsan = ngayBsan;
    }
    
    
}
