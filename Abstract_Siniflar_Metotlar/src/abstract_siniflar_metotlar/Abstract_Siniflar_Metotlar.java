package abstract_siniflar_metotlar;

public class Abstract_Siniflar_Metotlar {
    public static void main(String[] args) {
        Daire Daire_Nesnesi_1 = new Daire(2.6);
        Dikdortgen Dikdortgen_Nesnesi_1 = new Dikdortgen(3.0, 5.0);
        System.out.println(Daire_Nesnesi_1.alan_hesapla());
        System.out.println(Dikdortgen_Nesnesi_1.alan_hesapla());
        Dikdortgen_Nesnesi_1.isimbelirler("Dikdortgenim-1");
        Dikdortgen_Nesnesi_1.isimGetir();
    }
}
