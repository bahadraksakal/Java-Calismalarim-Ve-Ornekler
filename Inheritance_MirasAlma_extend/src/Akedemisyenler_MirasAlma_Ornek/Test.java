/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akedemisyenler_MirasAlma_Ornek;

import java.util.ArrayList;

/**
 *
 * @author bahad
 */
public class Test {
    private ArrayList<Kisi> uniKisiler = new ArrayList();

    public void addKisi(Kisi k1) {
        this.uniKisiler.add(k1);
    }

    public void show() {
        for (Kisi k : this.uniKisiler) {
            System.out.println(k.toString());
        }
    }

    public void showAkedemisyen() {
        System.out.println("AKEDEMISYEN");
        for (Kisi kisi1 : this.uniKisiler) {
            if (!(kisi1 instanceof Akedemisyen)) continue;
            System.out.println("\n" + kisi1.toString());
        }
    }

    public void showOgrenci() {
        System.out.println("OGRENCI");
        for (Kisi k : this.uniKisiler) {
            if (!(k instanceof Ogrenci)) continue;
            System.out.println("\n" + k.toString());
        }
    }
}
