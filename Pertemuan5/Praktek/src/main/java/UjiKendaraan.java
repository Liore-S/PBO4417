/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goobe
 */
public class UjiKendaraan {
    public static void main(String[] args){
        Bicycle pit = new Bicycle();
        pit.goStraight();
        pit.ringBell();
        pit.turnRight();
        
        MotorVehicle montor = new MotorVehicle(5,"H 4 M");
        montor.turnLeft();
        montor.goStraight();
        System.out.println(montor.getSizeOfEngine());
        System.out.println(montor.getLicencePlate());;
    }
}
