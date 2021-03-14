/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goobe
 */
class matematika{
    int a;
    int b;
    public matematika(){
        this.a = 2;
        this.b = 1;
    }
    public matematika(int angka){
        this.a = this.b = angka;
    }
    public matematika(int angka1,int angka2){
        a = angka1;
        b = angka2;
    }
    
    public int pertambahan(){
        return a+b;
    }
    public int pengurangan(){
        return a-b;
    }
    public int perkalian(){
        return a*b;
    }
    public int pembagian(){
        return a/b;
    }
}

public class matematikaDemo {
    public static void main(String[] args){
        matematika calc = new matematika();
        System.out.println("--------Without Parameter------");
        System.out.println("Pertambahan : "+calc.a+" + "+calc.b+" = "+ calc.pertambahan());
        System.out.println("Pengurangan : "+calc.a+" - "+calc.b+" = "+ calc.pengurangan());
        System.out.println("Perkalian : "+calc.a+" x "+calc.b+" = "+ calc.perkalian());
        System.out.println("Pembagian : "+calc.a+" / "+calc.b+" = "+ calc.pembagian());
        
        matematika calc2 = new matematika(5);
        System.out.println("------One Parameter-----");
        System.out.println("Pertambahan : "+calc2.a+" + "+calc2.b+" = "+ calc2.pertambahan());
        System.out.println("Pengurangan : "+calc2.a+" - "+calc2.b+" = "+ calc2.pengurangan());
        System.out.println("Perkalian : "+calc2.a+" x "+calc2.b+" = "+ calc2.perkalian());
        System.out.println("Pembagian : "+calc2.a+" / "+calc2.b+" = "+ calc2.pembagian());
        
        matematika calc3 = new matematika(18,8);
        System.out.println("------Two Parameter------");
        System.out.println("Pertambahan : "+calc3.a+" + "+calc3.b+" = "+ calc3.pertambahan());
        System.out.println("Pengurangan : "+calc3.a+" - "+calc3.b+" = "+ calc3.pengurangan());
        System.out.println("Perkalian : "+calc3.a+" x "+calc3.b+" = "+ calc3.perkalian());
        System.out.println("Pembagian : "+calc3.a+" / "+calc3.b+" = "+ calc3.pembagian());
    }
}
