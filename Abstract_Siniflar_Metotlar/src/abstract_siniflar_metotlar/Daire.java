package abstract_siniflar_metotlar;

public class Daire extends GeometrikSekil {
    private final double r;
    private final double PI = Math.PI;

    public Daire(double r) {
        this.r = r;
    }

    @Override
    public double alan_hesapla() {
        return this.r * this.r * Math.PI;
    }
}
