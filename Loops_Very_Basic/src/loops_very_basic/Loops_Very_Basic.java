package loops_very_basic;

public class Loops_Very_Basic {
    public static void main(String[] args) {
        int i=100;
        for (      ; i >= 0; --i) { // i  denmez tek başına direkt boş bırakılır.
            System.out.println(i);
        }
        i = 1;
        while (i <= 100) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("3 ve 7 ye tam bolunen sayimiz = " + i);
            }
            ++i;
        }
        int ikikatlari = 2;
        for (i = 0; i < 20; ++i) {
            System.out.println(ikikatlari);
            ikikatlari *= 2;
            System.out.println((int)Math.pow(2.0, i + 1));
        }
    
        for (i = 0; i < 10; ++i) {
            System.out.println("Mesaj i= " + i);
        }
        for (i = 0; i < 10; ++i) {
            System.out.println("while i= " + i);
        }
        do {
            System.out.println("do wihle i=" + i);
        } while (i < 10);
        
        
        for (int j = 1; i < 31; ++i) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
        
        
    }
}
