package final_anahtar_kelimesi;


class Kitap {
    private final String kitap_adi;
    private final yazar kitabin_yazari;
    private final String basim_yili;

    public Kitap(String kitap_adi, yazar kitabin_yazari, String basim_yili) {
        this.kitap_adi = kitap_adi;
        this.kitabin_yazari = kitabin_yazari;
        this.basim_yili = basim_yili;
    }

    public String isim_ver() {
        return this.kitap_adi;
    }

    public yazar yazari_ver() {
        return this.kitabin_yazari;
    }

    public String basim_yili_ver() {
        return this.basim_yili;
    }
}
