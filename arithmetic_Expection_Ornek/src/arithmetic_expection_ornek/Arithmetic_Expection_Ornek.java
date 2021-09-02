package arithmetic_expection_ornek;

import java.util.Random;

public class Arithmetic_Expection_Ornek {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] dizi = new int[20];
        for (int i = 0; i < dizi.length; ++i) {
            dizi[i] = rand.nextInt(4) - 1;
            try {
                int temp = 10 / dizi[i];
                System.out.println(temp);
                continue;
            }
            catch (Exception e) {
                System.out.println("Hata payda da s\u0131f\u0131r olamaz bu ifade tan\u0131ms\u0131zd\u0131r.    -----   " + e.toString());
            }
        }
    }    
}
