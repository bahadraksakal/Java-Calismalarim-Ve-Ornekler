package string_sinifi_metotlar;


public class String_Sinifi_Metotlar {
    public static void main(String[] args) {
        int i;
        String mesaj = "Bahad\u0131r";
        String mesaj2 = "Bahad\u0131r";
        String mesaj3 = new String("Bahad\u0131r");
        System.out.println(mesaj == mesaj2);
        System.out.println(mesaj == mesaj3);
        System.out.println(mesaj.equals(mesaj3));
        mesaj2 = "ahmet";
        System.out.println(mesaj == mesaj2);
        System.out.println("compare: " + mesaj.compareTo(mesaj3));
        String harf = "a";
        String harf2 = "b";
        System.out.println(harf.compareTo(harf2));
        System.out.println(mesaj2.concat(mesaj));
        System.out.println(harf.toUpperCase());
        System.out.println(mesaj.toLowerCase());
        String TrimOrnek = "       B a h a d r        ".trim();
        System.out.println(TrimOrnek + " length:: " + TrimOrnek.length());
        String mesaj4 = "Bahad\u0131r----Aksakal";
        System.out.println(mesaj4.replace("Bahad\u0131r", "Aksakal"));
        String mesaj5 = "Merhaba benim ad\u0131m bahad\u0131r ";
        String[] mesaj5_split = mesaj5.split(" ");
        String mesaj6 = "#######Merhaba###ad\u0131m#bahad\u0131r###";
        String[] mesaj6_split = mesaj6.split("#");
        for (i = 0; i < mesaj5_split.length; ++i) {
            System.out.println("eleman: " + mesaj5_split[i]);
        }
        for (i = 0; i < mesaj6_split.length; ++i) {
            System.out.println("eleman mesaj 6 : " + mesaj6_split[i]);
        }
        System.out.println(mesaj6.indexOf("M"));
        System.out.println(mesaj4.lastIndexOf("a"));
        System.out.println(mesaj5.indexOf("m", 15));
    }
}
