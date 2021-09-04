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
public class ogrenci implements Serializable {
    private String ad;
    private String soyad;

    public ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public String getter_ad() {
        return this.ad;
    }

    public String getter_soyad() {
        return this.soyad;
    }
}
