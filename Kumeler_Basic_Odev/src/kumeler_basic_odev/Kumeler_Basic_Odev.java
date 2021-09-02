/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kumeler_basic_odev;

/**
 *
 * @author bahad
 */
public class Kumeler_Basic_Odev {
    
    public static void main(String[] args) {
        kume k1 = new kume(new int[]{5, 3});
        kume k2 = new kume(new int[]{3, 2, 5, 7});
        k1.yazdir();
        k2.yazdir();
        if (k1.compareTo(k2) == 1) {
            System.out.println("Kümeler aynı");
        } else {
            System.out.println("Kümeler farklı");
        }
        k1.ekle(2);
        k1.yazdir();
        k2.sil((Object)7);
        k2.yazdir();
        if (k1.compareTo(k2) == 1) {
            System.out.println("Kücmeler aynı");
        } else {
            System.out.println("Kücmeler farklı");
        }
    }   
}
