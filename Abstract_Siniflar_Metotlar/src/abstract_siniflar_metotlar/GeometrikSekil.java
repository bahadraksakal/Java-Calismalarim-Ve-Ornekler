package abstract_siniflar_metotlar;

public abstract class GeometrikSekil {
    private String isim;

    public void isimbelirler(String isim) {
        this.isim = isim;
    }

    public String isimGetir() {
        System.out.println(this.isim);
        return this.isim;
    }

    public abstract double alan_hesapla();
}
