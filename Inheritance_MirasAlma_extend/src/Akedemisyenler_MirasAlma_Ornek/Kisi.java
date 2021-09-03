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
public class Kisi {
   private String ad;
    private String soyad;
    private String email;

    public Kisi(String ad, String soyad, String email) {
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return this.ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getSoyad() {
        return this.soyad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   @Override
    public String toString() {
        return " ad : " + this.ad + "\n soyad : " + this.soyad + "\n email : " + this.email;
    } 
}
