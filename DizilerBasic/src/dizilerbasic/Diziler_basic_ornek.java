package dizilerbasic;

public class Diziler_basic_ornek {
    public static void main(String[] args) {
        int[] SayiDizisi = new int[5];
        SayiDizisi[3] = 55;
        System.out.println(SayiDizisi[3]);
        int[] SayiDizisi2 = new int[]{0, 11, 22, 33, 44};
        System.out.println(SayiDizisi2[1]);
        String[] str = new String[]{"ali", "baba", "ve", "ben"};
        System.out.println(str[0] + " " + str[2] + " " + str[3]);
    }
}
