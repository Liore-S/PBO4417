/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goobe
 */
public class SimpleCircle {
    double radius = 14;
    
    SimpleCircle(){
    }
    
    SimpleCircle(double radius){
        this.radius = radius;
    }
    
    double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    
    double getCircumference(){
        return 2*this.radius*Math.PI;
    }

}
