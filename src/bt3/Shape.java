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
public abstract class Shape {
    String brush;
    String paper;
    String frame;
    
    public abstract String draw();

    public String getBrush() {
        return brush;
    }

    public String getPaper() {
        return paper;
    }

    public String getFrame() {
        return frame;
    }

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }
    
    
}
