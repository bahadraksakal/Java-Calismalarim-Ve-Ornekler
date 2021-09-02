package math_class_basic_ornek;

import java.util.Random;


public class Math_Class_Basic_Ornek {
    
    public static void main(String[] args) {
        System.out.println("****üs Al****");
        System.out.println("pow: " + Math.pow(5.0, 3.0));
        int a_us = (int)Math.pow(5.0, 3.0);
        System.out.println("*****Kare Kök Al****");
        System.out.println("sqrt: " + Math.sqrt(25.0));
        int b_kok = (int)Math.sqrt(25.0);
        System.out.println("*****:Mutlakdeğer al***");
        System.out.println("abs: " + Math.abs(-4));
        int c_mutlakdeger = Math.abs(-4);
        System.out.println("****Alt deger yuvarla****");
        System.out.println("floor: " + Math.floor(7.9));
        System.out.println(Math.floor(7.1));
        int d_alt_yuvarla = (int)Math.floor(7.6);
        System.out.println("****üste yuvarlama****");
        System.out.println("ceil: " + Math.ceil(7.1));
        System.out.println(7.9);
        int e_yukari_yuvarla = (int)Math.ceil(7.51);
        System.out.println("****En Büyük Sayıyı Bul");
        System.out.println("max: " + Math.max(5.0, 7.1));
        System.out.println("max: " + Math.max(5, 7));
        System.out.println("max: " + Math.max(4.0, 4.0000001));
        System.out.println("min: " + Math.min(4.0, 4.00001));
        System.out.println("****Math ile Random Sayi*****");
        System.out.println("random: " + Math.random());
        Random rand = new Random();
        System.out.println("gaussian: " + rand.nextGaussian());
        System.out.println("kalan metotlar kitapta/nette lazım olunca bakarsın.");
    }
    
}
