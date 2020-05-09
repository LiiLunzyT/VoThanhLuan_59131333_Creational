/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author ASUS
 */
public class bt3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory shapeFac = new ShapeFactory();
        
        /**
         * Demo Rectangle
         */
        Shape v1 = shapeFac.createShape(ShapeType.rectangle);
        v1.setBrush("bút lông");
        v1.setPaper("giấy mềm");
        v1.setFrame("Khung gỗ");
        
        System.out.println(v1.draw());
        
        Shape v2 = shapeFac.createShape(ShapeType.rectangle);
        v2.setBrush("bút chì");
        v2.setPaper("giấy cứng");
        v2.setFrame("Khung nhựa");
        
        System.out.println(v1.draw());
        System.out.println(v2.draw());
        
        /**
         * Demo Triangle
         */
        Shape t1 = shapeFac.createShape(ShapeType.triangle);
        t1.setBrush("bút lông");
        t1.setPaper("giấy mềm");
        t1.setFrame("Khung gỗ");
        
        System.out.println(t1.draw());
        
        Shape t2 = shapeFac.createShape(ShapeType.triangle);
        t2.setBrush("bút chì");
        t2.setPaper("giấy cứng");
        t2.setFrame("Khung nhựa");
        
        System.out.println(t1.draw());
        System.out.println(t2.draw());
        
        /**
         * Demo Circle
         */
        Shape c1 = shapeFac.createShape(ShapeType.circle);
        c1.setBrush("bút lông");
        c1.setPaper("giấy mềm");
        c1.setFrame("Khung gỗ");
        
        System.out.println(c1.draw());
        
        Shape c2 = shapeFac.createShape(ShapeType.circle);
        c2.setBrush("bút chì");
        c2.setPaper("giấy cứng");
        c2.setFrame("Khung nhựa");
        
        System.out.println(c1.draw());
        System.out.println(c2.draw());
    }
    
}
