/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goobe
 */
class Mobil2{
    String warna;
    int tahunProduksi;
    boolean on;
    int gear;
    
    Mobil2(){
        this.on = false;
        this.gear = 1;
}
    
    public void hidupkanMobil(){
        this.on = true;
    }
    
    public void matikanMobil(){
        this.on = false;
    }
    
    public void ubahGigi(int gear){
        this.gear = gear;
    }
}

public class MobilDemo2 {
    public static void main(String[] args){
        Mobil2 mobilku = new Mobil2();

        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2006;
        
        mobilku.hidupkanMobil();
        mobilku.ubahGigi(5);
        
        Mobil2 mobilsaya = new Mobil2();
        
        mobilsaya.warna = "Merah";
        mobilsaya.tahunProduksi = 2012;
        
        mobilsaya.hidupkanMobil();
        mobilsaya.ubahGigi(3);
        mobilsaya.matikanMobil();
        
        System.out.println("Mobil 1");
        System.out.println("Warna : "+ mobilku.warna+ " Tahun : "+mobilku.tahunProduksi+
                " Gear : " +mobilku.gear);
        System.out.println("Mobil 2");
        System.out.println("Warna : "+ mobilsaya.warna+ " Tahun : "+mobilsaya.tahunProduksi+
                " Gear : " +mobilsaya.gear);
        
    }
}
