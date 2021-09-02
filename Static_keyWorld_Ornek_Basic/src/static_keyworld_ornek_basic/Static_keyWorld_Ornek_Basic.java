package static_keyworld_ornek_basic;

public class Static_keyWorld_Ornek_Basic {

    public static void main(String[] args) {
        Liseler BarisAnadolu = new Liseler("Baris Anadolu");
        System.out.println("Lisemizin adi: " + BarisAnadolu.getLiseAdi());
        System.out.println("adet: " + Liseler.getUretimAdeti());
        for (int i = 0; i < 458; i++) {
            new Liseler("xxx : "+i+". Lise ||");
        }
    }
    
}
