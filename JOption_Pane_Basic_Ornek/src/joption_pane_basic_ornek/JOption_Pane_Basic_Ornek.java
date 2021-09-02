package joption_pane_basic_ornek;

import javax.swing.JOptionPane;


public class JOption_Pane_Basic_Ornek {
    
    public static void main(String[] args) {
        String metin = JOptionPane.showInputDialog("bir metin griniz");
        System.out.println("kullanı sunu girdi : " + metin);
//        for (int i = 0; i < metin.length(); ++i) {
//            System.out.println(metin.charAt(i));
//            if (metin.charAt(i) >= '0' && metin.charAt(i) <= '9') continue;
//            System.exit(1);
//        }
//        int sayi = Integer.parseInt(metin);
//        int a = 1;
//        System.out.println(sayi + a);
        JOptionPane.showMessageDialog(null, "BUARAYA MESAJ GİR", "TABLO BAŞLIĞI", 3);
        int input = JOptionPane.showConfirmDialog(null, "evet mi hayir mi", "karar penceresi", 1, 3);
        System.out.println("kullanıcı ne karar verdi : " + input);
    }
    
}
