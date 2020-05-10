/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class HoaDon {
    HoaDonHeader header;
    ArrayList<ChiTietHoaDon> dsCTHD;
    
    public HoaDon(HDBuilder builder) {
        this.header = builder.header;
        this.dsCTHD = builder.dsCTHD;
    }
    
    @Override
    public String toString() {
        String str = "";
        str += header.toString();
        str += "Thông tin hoá đơn: \n";
        for(ChiTietHoaDon cthd : dsCTHD) {
            str += cthd.toString() + "\n";
        }
        return str;
    }
    
    public static class HDBuilder {
        HoaDonHeader header;
        ArrayList<ChiTietHoaDon> dsCTHD;
        
        public HDBuilder() {
            this.header = new HoaDonHeader();
            this.dsCTHD = new ArrayList<>();
        }
        
        public HDBuilder addHeader(HoaDonHeader head) {
            this.header = head;
            return this;
        }
        
        public HDBuilder addCTHD(ChiTietHoaDon cthd) {
            this.dsCTHD.add(cthd);
            return this;
        }
        
        public HoaDon build() {
            return new HoaDon(this);
        }
    } 
}
