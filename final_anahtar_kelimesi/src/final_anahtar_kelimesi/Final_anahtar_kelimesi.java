package final_anahtar_kelimesi;

public class Final_anahtar_kelimesi {
    public static void main(String[] args) {
        yazar Mehmet_yilmaz = new yazar("Mehmet,", "Yılmaz", "myilmaz@abc.com", 56);
        Kitap Javayi_seviyorum = new Kitap("Javayı Seviyorum", Mehmet_yilmaz, "1 Ocak 2009");
        System.out.println("cevap: " + Javayi_seviyorum.yazari_ver().yas_Ver());
    }    
}
