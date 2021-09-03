/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_mirasalma_extend;

/**
 *
 * @author bahad
 */
public class Inheritance_MirasAlma_extend {

    public static void main(String[] args) {
        insan Ahmet = new insan("Ahmet", "tornacı");
        ogrenci Ali = new ogrenci("Ali");
        Ali.set_meslek("ogrenci");
        System.out.println("yyyyy");
        System.out.println(Ali.get_ad());
        sekil ucgen = new sekil("üçgen", 3);
        System.out.println(ucgen.toString());
        System.out.println(ucgen.toString("orj"));
        Ali.set_ad("memet");
        ogrenci mehmet = new ogrenci("Mehmet");
        System.out.println(mehmet.get_ad());
        mehmet.set_no(99999);
        System.out.println(mehmet.get_no());
        System.out.println("ppppppppppp");
    }    
}
