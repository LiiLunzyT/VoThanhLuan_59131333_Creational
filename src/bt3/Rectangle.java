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
public class Rectangle extends Shape{
    private static Rectangle instance;
    
    private Rectangle() {
        
    }
    
    public static Rectangle createShape() {
        if( instance == null) {
            instance = new Rectangle();
        }
        return instance;
    }
    
    @Override
    public String draw() {
        return "Vẽ một hình vuông" + 
               " (bút: " + this.brush + ")" +
               " (giấy: " + this.paper + ")" +
               " (khung: " + this.frame + ")";
    }

}
