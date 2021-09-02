package throws_try.catch_expection_ornekler;

public class Throws_TryCatch_Expection_Ornekler {
    
    public static void main(String[] args) {
        int[] dizi = new int[]{11, 22, 33, 44};
        try {
            System.out.println("try bloğuna girdik");
            System.out.println(dizi[5]);
        }
        catch (Exception e) {
            System.out.println("Hata alındığı için catch bloğuna girildi");
            System.out.println(e.toString());
            System.out.println("catch bloğundan çıkılıyor.");
        }
        finally {
            System.out.println("TRY CATCH TEMEL MANTIĞI");
        }
        int a = 0;
        int b = 10;
        try {
            int c = b / a;
        }
        catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
        finally {
            System.out.println("Try-catch programın patlamasını önler");
        }
    }
    
}
