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
public class Triangle extends Shape{
    private static Triangle instance;
    
    private Triangle() {
        
    }
    
    public static Triangle createShape() {
        if( instance == null) {
            instance = new Triangle();
        }
        return instance;
    }
    
    @Override
    public String draw() {
        return "Vẽ một hình tam giác" + 
               " (bút: " + this.brush + ")" +
               " (giấy: " + this.paper + ")" +
               " (khung: " + this.frame + ")";
    }
}
