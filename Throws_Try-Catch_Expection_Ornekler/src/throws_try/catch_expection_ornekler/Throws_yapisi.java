package throws_try.catch_expection_ornekler;


public class Throws_yapisi {
    public static void main(String[] args) {
        int[] dizi = new int[]{11, 22, 33};
        try {
            Throws_yapisi.metot2(dizi);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array hatası özel tanımlanmış");
            System.out.println(e.toString());
        }
        catch (Exception e) {
            System.out.println("genel tanımlanmış hata");
            System.out.println(e.toString());
        }
    }

    static void eleman(int[] dizi) throws ArrayIndexOutOfBoundsException {
        System.out.println(dizi[6]);
    }

    static void metot2(int[] dizi) throws Exception {
        System.out.println("burası metot 2");
        Throws_yapisi.eleman(dizi);
    }
}
