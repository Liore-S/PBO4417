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

class Q1{
    Queue<String> List;

    Q1(){
        List = new LinkedList<>();
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
class Q2 extends Q1{
    public void iteration(){
        while(List.iterator().hasNext()){
            System.out.print(List.iterator().next()+ " ");
        }
    }
    public void peek(){
        System.out.println("Element pertama: "+List.peek());
    }
}

public class Queue_List {
    public static void main(String[] args){
        Q2 List2 = new Q2();
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
        System.out.println("-----Peek-----");
        List2.peek();
    }
}
