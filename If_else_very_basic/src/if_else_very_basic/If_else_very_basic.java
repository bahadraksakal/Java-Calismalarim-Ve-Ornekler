package if_else_very_basic;

import java.util.Scanner;

public class If_else_very_basic {
    public static void main(String[] args) {
        for (int y = 0; y < 13; ++y) {
            int i = y;
            if (i == 10) {
                System.out.println("kontrol is true = 10");
            } else {
                if (i < 7) continue;
                if (i == 12) break;
                System.out.println("kontrol is false");
            }
            System.out.println(i + ". dongu");
        }
        System.out.println("\nORNEK SORU\n");
        
        int i;
        String[] ogrenciler = new String[]{"ali", "veli", "kemal", "Suna", "Ay\u015fe"};
        int[] ogrenci_notlari = new int[5];
        Scanner notoku = new Scanner(System.in);
        for (i = 0; i < 5; ++i) {
            System.out.println(ogrenciler[i] + " in notunu giriniz");
            ogrenci_notlari[i] = notoku.nextInt();
        }
        for (i = 0; i < 5; ++i) {
            if (ogrenci_notlari[i] >= 80) {
                System.out.println(ogrenciler[i] + " : AA Aldi");
                continue;
            }
            if (ogrenci_notlari[i] >= 70) {
                System.out.println(ogrenciler[i] + " : BB Aldi");
                continue;
            }
            if (ogrenci_notlari[i] >= 60) {
                System.out.println(ogrenciler[i] + " : CC Aldi");
                continue;
            }
            System.out.println(ogrenciler[i] + " : FF Aldi");
        }
        
    }
}
