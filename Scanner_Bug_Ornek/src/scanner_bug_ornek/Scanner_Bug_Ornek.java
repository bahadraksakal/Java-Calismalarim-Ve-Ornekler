package scanner_bug_ornek;

import java.util.Scanner;

public class Scanner_Bug_Ornek {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        String isim = myscan.next();
        System.out.println("girildi1: "+isim);
        myscan.nextLine(); // bunu tampon olarak kullanmaz isek sıradaki satırı alamayız.
        isim = myscan.nextLine();
        System.out.println("girildi2: "+isim);
    }    
}
