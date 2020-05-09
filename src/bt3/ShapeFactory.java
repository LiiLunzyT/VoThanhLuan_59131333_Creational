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
public class ShapeFactory {

    public ShapeFactory() {
    }
    
    public Shape createShape(ShapeType type) {
        switch(type) {
            case rectangle: return Rectangle.createShape();
            case triangle:  return Triangle.createShape(); 
            default:        return Circle.createShape();
        }
    }
}
