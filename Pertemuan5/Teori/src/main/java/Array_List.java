/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goobe
 */
import java.util.ArrayList;

class L1{
    ArrayList<String> List;

    L1() {
        this.List = new ArrayList<>();
    }
    public void add(String str){
        List.add(str);
    }
    public void remove(String str){
        List.remove(str);
    }
    public void print(){
        System.out.println(List);
    }
}

class L2 extends L1{
    public void set(int index, String isi){
        List.set(index, isi);
    }
}

public class Array_List{
    public static void main(String[] args){
        L2 List2 = new L2();
        System.out.println("-----Add-----");
        List2.add("Lele");
        List2.add("Gurame");
        List2.add("Tuna");
        List2.add("Mujair");
        List2.add("Bulu babi");
        List2.print();
        System.out.println("-----Remove-----");
        List2.remove("Lele");
        List2.remove("Mujair");
        List2.print();
        System.out.println("-----Set-----");
        List2.set(0, "Kura-Kura");
        List2.set(2, "Patin");
        List2.print();
    }
}
