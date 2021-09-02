package static_keyworld_ornek_basic;


public class Liseler {
    private static int uretimadeti = 0;
    final int Liselertoplami = 456;
    private String Liseninadi;

    public Liseler(String Liseninadi) {
        this.Liseninadi = Liseninadi;
        if (uretimadeti == 456) {
            System.out.println(this.Liseninadi+"   : bu lise bu şehre ait olamaz bu nesne hatalidir ");
            --uretimadeti;
        }
        ++uretimadeti;
    }

    String getLiseAdi() {
        return this.Liseninadi;
    }

    static int getUretimAdeti() {
        return uretimadeti;
    }
}
