/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_sinifi_metotlar;

/**
 *
 * @author bahad
 */
public class String_metotlar_ek {
    public static void main(String[] args) {
        String yazi = "Bahadır Aksakal Java şifreniyor";
        System.out.println(yazi);
        yazi = yazi.toUpperCase();
        System.out.println(yazi);
        int indextut = yazi.indexOf(304);
        System.out.println("ilk i harfinin bulunudugu index=" + indextut);
        String IlkKelime = yazi.substring(indextut);
        System.out.println("ilk kelime disindakiler=" + IlkKelime);
        IlkKelime = yazi.substring(0, indextut);
        System.out.println("ilk kelime=" + IlkKelime);
        int SonKelimeIndexi = yazi.lastIndexOf(32);
        String SonKelime = yazi.substring(SonKelimeIndexi + 1);
        System.out.println(SonKelime);
        System.out.println(yazi.charAt(1));
    }
}
