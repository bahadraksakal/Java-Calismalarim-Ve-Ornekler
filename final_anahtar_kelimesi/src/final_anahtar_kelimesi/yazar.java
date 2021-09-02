package final_anahtar_kelimesi;


class yazar {
    private final String ad;
    private final String Soyad;
    private final String email;
    private final int yas;

    public yazar(String ad, String Soyad, String email, int yas) {
        this.ad = ad;
        this.Soyad = Soyad;
        this.email = email;
        this.yas = yas;
    }

    public int yas_Ver() {
        return this.yas;
    }
}
