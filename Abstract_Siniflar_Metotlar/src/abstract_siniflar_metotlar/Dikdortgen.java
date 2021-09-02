package abstract_siniflar_metotlar;

public class Dikdortgen extends GeometrikSekil {
    private final double kenar1;
    private final double kenar2;

    public Dikdortgen(double kenar1, double kenar2) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
    }

    @Override
    public double alan_hesapla() {
        return this.kenar1 * this.kenar2;
    }
}
