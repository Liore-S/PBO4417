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
public class ReadConsole {
    public static void main(String args[]) throws IOException{
        InputStreamReader chara = null;
        try{
            chara = new InputStreamReader(System.in);
            System.out.println("Masukkan 'x' untuk menampilkan nama : ");
            char c;
            do{
                c = (char) chara.read();
            }while(c != 'x');
        }finally{
            if(chara != null){
                System.out.println("Nama : Ilham");
                chara.close();
            }
        }
    }    
}
