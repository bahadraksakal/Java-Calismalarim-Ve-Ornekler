package aritmatik_islemler_basic_ornek;

public class Aritmatik_Islemler_Basic_Ornek {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println("parantezin onemi = " + (a + b));
        System.out.println("parantezin onemi = " + a + b);
        System.out.println("parantezin onemi = " + a * b);
        System.out.println("parantezin onemi = " + (float)a / b); // en az biri cast edilmezse integer döner.
        System.out.println("parantezin onemi = 2");
        System.out.println("parantezin onemi = " + (a > b));
        System.out.println("parantezin onemi = " + (b > a));
    }
}
