/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goobe
 */
public class TestTV {
    public static void main(String[] args){
//        TV tv1 = new TV();
//        tv1.turnOn();
//        tv1.setChannel(30);
//        tv1.setVolumeLevel(3);
//        
//        TV tv2 = new TV();
//        tv2.turnOn();
//        tv2.channelUp();
//        tv2.channelUp();
//        tv2.volumeUp();
//        
//        System.out.println("TV1 channel is " + tv1.channel + 
//                " and volume level is " + tv1.volumeLevel);
//        System.out.println("TV2 channel is " + tv2.channel +
//                " and volume level is " + tv2.volumeLevel);
        Manusia man1 = new Manusia("Erik");
        System.out.println(man1.namaSaya());
        TV tvku = new TV();
        man1.beliTV(tvku);
        System.out.println(man1.cekTV());
        man1.jualSemuaTV();
        System.out.println(man1.cekTV());
    }
}
