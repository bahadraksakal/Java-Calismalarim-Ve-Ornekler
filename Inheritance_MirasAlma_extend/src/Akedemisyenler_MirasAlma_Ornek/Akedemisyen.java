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
public class Akedemisyen extends Kisi {
    private final int id;
    private ArrayList<Ogrenci> danismaniOlunanOgrenciler;
    private ArrayList<Ders> verilenDersler;

    public Akedemisyen(String ad, String soyad, int id, String email) {
        super(ad, soyad, email);
        this.id = id;
        this.danismaniOlunanOgrenciler = new ArrayList();
        this.verilenDersler = new ArrayList();
    }

    public void addDers(Ders ders) {
        this.verilenDersler.add(ders);
    }

    public void addOgrenci(Ogrenci o1) {
        this.danismaniOlunanOgrenciler.add(o1);
    }

    public void removeDers(Ders ders) {
        this.verilenDersler.remove((Object)ders);
    }

    public void removeOgrenci(Ogrenci o1) {
        this.danismaniOlunanOgrenciler.remove((Object)o1);
    }

    public int getId() {
        return this.id;
    }

    public void showVerilenDersler() {
        System.out.println("VERILEN DERSLER");
        for (Ders ders1 : this.verilenDersler) {
            System.out.println(ders1.toString());
        }
    }

    public void showOgrenciler() {
        System.out.println("DANISMANI OLUNAN OGRENCILER");
        for (Ogrenci ogrenci1 : this.danismaniOlunanOgrenciler) {
            System.out.println(ogrenci1.toString());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n id: " + this.id;
    }
}
