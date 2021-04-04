/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goobe
 */
import java.util.*;

class S1{
    Stack<String> List;

    S1(){
        List = new Stack<>();
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
class S2 extends S1{
    public void set(int index, String isi){
        List.set(index, isi);
    }
}

public class Stack_List {
    public static void main(String[] args){
        S2 List2 = new S2();
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
        List2.set(0, "Kumbang");
        List2.set(2, "Singa");
        List2.print();
    }
}
