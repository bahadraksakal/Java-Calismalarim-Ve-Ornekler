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
public class insan{
    private String ad;
    private String meslek;

    public String get_meslek() {
        return this.meslek;
    }

    public void set_meslek(String meslek) {
        this.meslek = meslek;
    }

    public void set_ad(String ad) {
        this.ad = ad;
    }

    public String get_ad() {
        System.out.println("souttaki ad: " + this.ad);
        return this.ad;
    }

    public insan(String ad) {
        this.ad = ad;
        System.out.println("insan const u çağrıldı.");
    }

    public insan(String ad, String meslek) {
        this.ad = ad;
        this.meslek = meslek;
    }
}
