/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garbagecollectorbasic;

/**
 *
 * @author bahad
 */
public class GarbageCollectorBasic {

    public static void main(String[] args) {
        insan ali = new insan();
        ali.ad = "ali";
        ali.yas = 21;
        ali.boy = 160;
        ali.kilo = 55;
        System.out.println("ismi " + ali.ad + "\nyaşı " + ali.yas + "\nboyu " + ali.boy + "\nkilosu " + ali.kilo + "\n");
        insan veli = new insan("veli", 18, 168, 58);
        System.out.println("ismi " + veli.ad);
        System.out.println("yaşı " + veli.yas);
        System.out.println("boyu " + veli.boy);
        System.out.println("kilosu " + veli.kilo);
        new insan();
        System.gc();
    }
    
}
