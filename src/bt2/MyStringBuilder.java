/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author ASUS
 */
public class MyStringBuilder {
    String str;

    public MyStringBuilder() {
        String str = "";
    }
    
    public MyStringBuilder addString(String s) {
        this.str += s;
        return this;
    }
    public MyStringBuilder addFloat(float f) {
        this.str += Float.toString(f);
        return this;
    }
    public MyStringBuilder addBoolean(boolean b) {
        this.str += Boolean.toString(b);
        return this;
    }
    @Override
    public String toString() {
        return str;
    }
}
