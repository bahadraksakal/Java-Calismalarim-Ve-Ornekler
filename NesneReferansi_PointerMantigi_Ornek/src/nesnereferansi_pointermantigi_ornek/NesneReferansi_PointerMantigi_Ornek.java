package nesnereferansi_pointermantigi_ornek;

import java.util.concurrent.atomic.AtomicInteger;


public class NesneReferansi_PointerMantigi_Ornek {
    public static void main(String[] args) {
        Integer sayi = new Integer(3); // valueof // guncel kullanim sekli
        Integer sayi2 = 5;
        System.out.println(sayi);
        AtomicInteger sayiReferans1 = new AtomicInteger(7);
        AtomicInteger sayiReferans2 = new AtomicInteger(11);
        NesneReferansi_PointerMantigi_Ornek.dochangeAtomicInt(sayiReferans1, sayiReferans2);
        System.out.println("sayireferans1 atamic Int= " + sayiReferans1);
        int g = 80;
        NesneReferansi_PointerMantigi_Ornek.carpma(sayi, sayi2);
        System.out.println("primitf= " + sayi);
        NesneReferansi_PointerMantigi_Ornek.carpmaReferans(sayi, sayi2);
        sayi2 = sayi2 * sayi2;
        System.out.println("referans bu çalışmaz ama atomic ınteger çalışır.=" + sayi);
        A sayi3 = new A();
        A sayi4 = new A();
        sayi3.a = 7;
        sayi4.a = 9;
        NesneReferansi_PointerMantigi_Ornek.AninReferansi(sayi3, sayi4);
        System.out.println("sayi3.a =" + sayi3.a);
    }

    static void dochangeAtomicInt(AtomicInteger a, AtomicInteger b) {
        int sayi1 = a.intValue();
        int sayi2 = b.intValue();
        a.set(sayi1 *= sayi2);
    }

    static void carpma(int a, int b) {
        System.out.println("girdi primitif");
        System.out.println("primitif int a=(" + (a *= b));
    }

    static void carpmaReferans(Integer a, Integer b) {
        System.out.println("girdi referans");
        a = a * b;
        System.out.println("Integer a= " + a);
    }

    static void AninReferansi(A sayi3R, A sayi4R) {
        sayi3R.a *= sayi4R.a;
    }
    
}
