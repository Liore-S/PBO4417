/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Vehicle.Bicycle;
import Vehicle.Mobil;
/**
 *
 * @author goobe
 */
public class TransportasiDemo {
    public static void main(String[] args){
        Mobil mb = new Mobil();
        Bicycle spd = new Bicycle();
        
        spd.ringBell();
        mb.hidupkanMobil();
        mb.matikanMobil();
    }
}
