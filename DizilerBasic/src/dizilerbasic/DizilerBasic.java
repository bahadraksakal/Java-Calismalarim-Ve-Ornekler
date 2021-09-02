package dizilerbasic;


public class DizilerBasic {

   public static void main(String[] args) {
        int[] dizi2 = new int[5];
        int[] dizi3 = new int[]{1, 2, 3};
        int[] dizi4 = new int[]{11, 22, 33, 44};
        String[] metin = new String[3];
        String[] metin2 = new String[]{"ali", "veli", "deli"};
        String[] metin3 = new String[]{"kiraz", "karpuz", "kavun"};
        String[] metin5 = new String[]{"ahmet", "mehmet"};
        System.out.println("***Object sınıfı***");
        Object[] StructImsi = new Object[]{5, "mehmet", Character.valueOf('x'), 2.11, true, Float.valueOf(3.12f), metin2[1]};
        System.out.println(StructImsi[6]);
        System.out.println("***System.arrayCOPY***");
        int[] diziHedef = new int[10];
        int[] diziKaynak = new int[]{1111, 2222, 3333, 4444, 5555};
        int i = 0;
        int k = 11;
        while (i < 5) {
            diziHedef[i] = k;
            ++i;
            k += 20;
        }
        for (int i2 : diziHedef) {
            System.out.println(i2);
        }
        System.out.println("************");
        System.arraycopy(diziKaynak, 0, diziHedef, 5, 5);
        for (int i2 : diziHedef) {
            System.out.println(i2);
        }
        System.out.println("****Diziler Ve Referansların Birbirine Atanması*****");
        int[] sayilarX = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] sayilarY = new int[]{77, 88, 99};
        for (int i3 : sayilarX) {
            System.out.print(i3 + " ");
        }
        sayilarY = sayilarX;
        System.out.println("");
        for (int i3 : sayilarY) {
            System.out.print(i3 + " ");
        }
        sayilarY[0] = 999;
        System.out.printf("\nSayilerX[0}: %d\n", sayilarX[0]);
    }    
}
