
package encapsulation_ve_accessmodifiers;

import Public_Belirteci.Public_kisiler;


public class Encapsulation_VE_AccessModifiers {

    public static void main(String[] args) {
        ev anne = new ev();
        Kisiler baba = new Kisiler();
        baba.kasa();
        System.out.println(baba.belge);
        System.out.printf("\n****farkli packageden public saesinde erişfmek****\n", new Object[0]);
        Public_kisiler halk = new Public_kisiler();
        halk.duyuru();
        Public_kisiler.nufus = 90000000;
        System.out.println(Public_kisiler.nufus);
        System.out.printf("\nnot: eğer erişim belirteci yazmasak java bunu default kabul eder, o sınıftan ve aynı paket altındaki sınıflar erişfiebilirsiniz;\nFAKAT o sınıftan türetilen diğer sınıflardan erişemezsiniz\n", new Object[0]);
    }
    
}
