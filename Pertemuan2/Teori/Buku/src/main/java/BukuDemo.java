/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goobe
 */
class Buku{
    String Judul;
    String Pengarang;
    String Penerbit;
    int Tahun;
    public Buku(String judul,String pengarang,String penerbit,int tahun){
        Judul = judul;
        Pengarang = pengarang;
        Penerbit = penerbit;
        Tahun = tahun;
    } 
    public void cetakBuku(){
        System.out.println("Judul : "+Judul);
        System.out.println("Pengarang : "+Pengarang);
        System.out.println("Penerbit : "+Penerbit);
        System.out.println("Tahun : "+Tahun);
    }
}
public class BukuDemo {
    public static void main(String[] args){
        Buku buku1 = new Buku("Inside","Lele","Gramed",2010);
        Buku buku2 = new Buku("Masak-Masak","Gurame","Gramed",2015);
        System.out.println("---First Book---");
        buku1.cetakBuku();
        System.out.println("---Second Book---");
        buku2.cetakBuku();
    }
}
