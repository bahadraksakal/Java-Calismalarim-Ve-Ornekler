package enum_kavrami;

public class Enum_Kavrami {
    public static void main(String[] args) {
        System.out.println("acaba pzatesi gunu haftanın kacıncı gunu ?");
        System.out.println(Gunler.PAZARTESİ.getGunİndisi());
        System.out.println("acaba cumartesi gunu haftanın kacıncı gunu ?");
        System.out.println(Gunler.CUMA.getGunİndisi());
        System.out.println("***" + Gunler.PAZAR);
        for (Gunler a : Gunler.values()) {
            System.out.print(a.name() + " - ");
            System.out.print(a + " - ");
            System.out.println(a.getGunİndisi());
        }
        System.out.println(Gunler.ÇARŞAMBA.ordinal());
        Gunler.Uyari();
    }
}
