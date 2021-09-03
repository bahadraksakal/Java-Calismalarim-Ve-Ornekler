package Akedemisyenler_MirasAlma_Ornek;


public class Ogrenci extends Kisi {
    private final int ogrenciNo;
    private int ortalama;

    public Ogrenci(String ad, String soyad, int ogrenciNo, String email, int ortalama) {
        super(ad, soyad, email);
        this.ogrenciNo = ogrenciNo;
        this.ortalama = ortalama;
    }

    public void setOrtalama(int ortalama) {
        this.ortalama = ortalama;
    }

    public int getOrtalama() {
        return this.ortalama;
    }

    @Override
    public String toString() {
        return super.toString() + "\n ogrenci no : " + this.ogrenciNo + " \n ortalama: " + this.ortalama;
    }
}
