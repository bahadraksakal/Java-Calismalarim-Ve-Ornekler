
package file_class_detayli;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class File_byte_Tabanli {
    public static void main() {
        try {
            File f = new File("D:\\Belgeler\\NetBeansProjects\\File_class\\deneme-4.txt");
            FileOutputStream yazdir = new FileOutputStream(f, true);
            String metin = "selam k\u0131zlar sizi g\u00f6rmeyince i\u00e7im s\u0131zlar\n";
            byte[] b_metin = metin.getBytes();
            yazdir.write(b_metin);
            yazdir.close();
            FileInputStream oku = new FileInputStream(f);
            byte[] b_oku = new byte[(int)f.length()];
            oku.read(b_oku);
            String metin2 = new String(b_oku);
            System.out.println(metin2);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
