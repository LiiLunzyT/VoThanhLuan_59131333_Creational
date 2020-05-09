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
public class Circle extends Shape {
    private static Circle instance;
    
    private Circle() {
        
    }
    
    public static Circle createShape() {
        if( instance == null) {
            instance = new Circle();
        }
        return instance;
    }
    
    @Override
    public String draw() {
        return "Vẽ một hình tròn" + 
               " (bút: " + this.brush + ")" +
               " (giấy: " + this.paper + ")" +
               " (khung: " + this.frame + ")";
    }
}
