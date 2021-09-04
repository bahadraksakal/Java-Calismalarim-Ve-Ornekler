/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneserilestirme_externalizable_arayuzu;

import java.io.Serializable;

/**
 *
 * @author bahad
 */
public class Uyeler implements Serializable {
    private String ad;
    private int yas;

    public Uyeler(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    public int get_yas() {
        return this.yas;
    }

    public String get_ad() {
        return this.ad;
    }
}
