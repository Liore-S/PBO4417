/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicle;

/**
 *
 * @author goobe
 */
public class Mobil {
    boolean on;
    int gear;
    
    public Mobil(){
        on = false;
        gear = 1;
    }
    
    public void hidupkanMobil(){
        System.out.println("Mobil dinyalakan");;
    }
    
    public void matikanMobil(){
        System.out.println("Mobil dimatikan");
    }
}

