package Akedemisyenler_MirasAlma_Ornek;

public class Ders {
    private String dersAdi;
    private int akts;
    private Akedemisyen dersiVeren;
    private String gun;
    private double saat;

    public Ders(String dersAdi, int akts, String gun, double saat) {
        this.dersAdi = dersAdi;
        this.akts = akts;
        this.gun = gun;
        this.saat = saat;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public void setAkts(int akts) {
        this.akts = akts;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    public void setSaat(double saat) {
        this.saat = saat;
    }

    public String getDersAdi() {
        return this.dersAdi;
    }

    public int getAkts() {
        return this.akts;
    }

    public String getGun() {
        return this.gun;
    }

    public double getSaat() {
        return this.saat;
    }

    public Akedemisyen getDersiVeren() {
        return this.dersiVeren;
    }

    public void setDersiVeren(Akedemisyen a1) {
        this.dersiVeren = a1;
    }

    @Override
    public String toString() {
        return "\n ders adi : " + this.dersAdi + " akts : " + this.akts + " gun : " + this.gun + " saat : " + this.saat;
    }
}
