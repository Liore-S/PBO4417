/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Liore
 */

import java.awt.*;
import java.awt.event.*;

public class BeratIdeal extends Frame implements ActionListener{
    Label nim,nama,berat,tinggi,hasil;
    TextField t1,t2,t3,t4;
    Button b1;
    
    BeratIdeal(){
       
        nim = new Label("NIM");
        nim.setBounds(20,50,50,20);
        t1 = new TextField();
        t1.setBounds(80,50,150,20);
        
        nama = new Label("Nama ");
        nama.setBounds(20,100,50,20);
        t2 = new TextField();
        t2.setBounds(80,100,150,20);
        
        berat = new Label("Berat ");
        berat.setBounds(20,150,50,20);
        t3 = new TextField();
        t3.setBounds(80,150,150,20);
        
        tinggi = new Label("Tinggi ");
        tinggi.setBounds(20,200,50,20);
        t4 = new TextField();
        t4.setBounds(80,200,150,20);
        
        hasil = new Label();
        hasil.setBounds(80,300,300,20);
        
        b1 = new Button("Hitung");
        b1.setBounds (80,250,70,30);
        
        b1.addActionListener(this);
        
        add(nim);add(nama);add(berat);add(tinggi);add(hasil);
        add(t1);add(t2);add(t3);add(t4);add(b1);
        
        setSize(700,500);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }});
        
    }
    
    @Override
    public void actionPerformed (ActionEvent e){
        String s1 = t3.getText();
        String s2 = t4.getText();
        String s3 = "";
        String name = t2.getText();
        String nim1 = t1.getText();
        
        
        double a = Double.parseDouble(s1);
        double b = Double.parseDouble(s2);
        double c = 0;
        
        if (e.getSource()==b1){
            c = (b/100);
            c = c * c;
            c = a / c;
        }
        if (18.5<=c && c>=24.9){
            s3 = (nim1+"  "+name+"  "+"  Berat Anda Ideal");
        }
        else{
            s3 = (nim1+"  "+name+"  "+"  Berat Anda Tidak Ideal");
        }
        
        String ket = String.valueOf(s3);
        
        hasil.setText(ket);
    }
    
    public static void main (String[] args){
        new BeratIdeal();
    }
    
}
