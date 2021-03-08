/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goobe
 */
public class TestSimpleCircle { 
    
    public static void main(String args[]) {
        SimpleCircle circle1 = new SimpleCircle();
        double radius = circle1.radius;
        double area = circle1.getArea();
        double Circumference = circle1.getCircumference();
        System.out.println("Radius : "+ radius);
        System.out.println("Area : "+ area);
        System.out.println("Circumference : "+ Circumference);
    }
}
