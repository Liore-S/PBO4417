/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goobe
 */
import java.io.*;
public class TV {
    int channel;
    int volumeLevel;
    boolean on;
    
//    TV(){
//        this.channel = 1;
//        this.volumeLevel = 3;
//        this.on = false;
//    }
//    
//    public void turnOn(){
//        this.on = true;
//    }
//    public void turnOff(){
//        this.on = false;
//    }
//    public void setChannel(int channel){
//        this.channel = channel;
//    }
//    public void setVolumeLevel(int volumeLevel){
//        this.volumeLevel = volumeLevel;
//    }
//    public void channelUp(){
//        if(this.channel < 120){
//            this.channel += 1;
//        }
//    }
//    public void channelDown(){
//        if(this.channel > 1){
//            this.channel -= 1;
//        }
//    }
//    public void volumeUp(){
//        if(this.volumeLevel < 7){
//            this.volumeLevel += 1;
//        }
//    }
//    public void volumeDown(){
//        if(this.volumeLevel > 1){
//            this.volumeLevel -= 1;
//        }
//    }
}
class Manusia{
    String nama;
    boolean punyaTV;
    
    public Manusia(){
        this.nama = "noname";
    }
    public Manusia(String Nama){
        this.nama = Nama;
    }
    public String namaSaya(){
        return nama;
    }
    public void beliTV(TV tiviku){
        punyaTV = true;
    }
    public void jualSemuaTV(){
        punyaTV = false;
    }
    public boolean cekTV(){
        return punyaTV;
    }
}