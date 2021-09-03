/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akedemisyenler_MirasAlma_Ornek;

/**
 *
 * @author bahad
 */
public class Akedemisyenler_MirasAlma_Ornek {
     public static void main(String[] args) {
        Ogrenci o1 = new Ogrenci("ece", "demir", 12345, "ece@gmail.com", 89);
        o1.setAd("esma");
        System.out.println(o1.getAd());
        Ogrenci o2 = new Ogrenci("ali", "demir", 4567, "ali@gmail.com", 78);
        Akedemisyen a1 = new Akedemisyen("ergun", "gumus", 9876, "ergun@gmail.com");
        Akedemisyen a2 = new Akedemisyen("erdem", "yavuz", 6767, "erdem@gmail.com");
        Ders d1 = new Ders("programlamaya giris", 6, "sali", 13.0);
        a1.addDers(d1);
        a2.addOgrenci(o1);
        a1.addOgrenci(o2);
        Test t1 = new Test();
        t1.addKisi((Kisi)a1);
        t1.addKisi((Kisi)a2);
        t1.addKisi((Kisi)o1);
        t1.addKisi((Kisi)o2);
        a1.showOgrenciler();
        a1.removeOgrenci(o2);
        a1.showOgrenciler();
    }
}
