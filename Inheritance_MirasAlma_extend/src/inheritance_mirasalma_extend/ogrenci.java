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
public class ogrenci extends insan {
    private int no;
    private String okul;

    public void set_no(int no) {
        this.no = no;
    }

    public void set_okul(String okul) {
        this.okul = okul;
    }

    public int get_no() {
        return this.no;
    }

    public String get_okul() {
        return this.okul;
    }

    public ogrenci(String ad) {
        super(ad);
        System.out.println("sub class const u çağrıldı.");
        super.get_ad();
        System.out.println("xxxx");
    }

    @Override
    public void set_ad(String ad) {
        System.out.println("isim değiştirildi");
    }
}
