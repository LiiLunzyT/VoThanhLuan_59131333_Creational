/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author ASUS
 */
public class bt1Main {

    public static void main(String[] args) throws ParseException {
        HoaDon hd = new HoaDon.HDBuilder()
                .addHeader(new HoaDonHeader(
                "HD001",
                "Võ Thành Luân",
                new SimpleDateFormat("dd-MM-yyyy").parse("08-05-2020")))
                .addCTHD(new ChiTietHoaDon("Bút chì", 2, 2000, (float) 0.2))
                .addCTHD(new ChiTietHoaDon("Bút mực", 2, 5000, (float) 0.2))
                .build();
        
        System.out.println(hd.toString());
    }
    
}
