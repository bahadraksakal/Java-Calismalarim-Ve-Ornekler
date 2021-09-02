package file_class_detayli;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class File_Class_Detayli {

    public static void main(String[] args) {
        System.out.println("**** Byte bazlı veri taşıma ****");
        String dosyaYolu = "D:\\Belgeler\\NetBeansProjects\\File_class\\deneme-1.txt";
        File denemeMetni = new File(dosyaYolu);
        if (denemeMetni.exists()) {
            File f = new File("D:\\Belgeler\\NetBeansProjects\\File_class\\deneme-2.txt");
            denemeMetni.renameTo(f);
            System.out.println("Dosya okunabilir : " + denemeMetni.canRead() + "\nDosya yazılabilir : " + denemeMetni.canWrite());
            System.out.println("Dosyanın kapladığı alan: " + denemeMetni.getTotalSpace());
            System.out.println("\n******Scanner yerine Filereader ile dosyadan okuma işlemi*****\n");
            char[] veriler = new char[(int)denemeMetni.length()];
            try {
                FileReader dosyaOku = new FileReader(denemeMetni);
                int a = dosyaOku.read(veriler);
                System.out.println("a: " + a);
                String okunan = new String(veriler);
                System.out.println("\n*****Okunan veri **** \n" + okunan);
                dosyaOku.close();
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("\n****FileWriter ile dosyaya yazma*****\n");
            try {
                FileWriter yazici = new FileWriter(denemeMetni, true);
                String metin = "merhaba ben FileWriter Bahadir tarafindan kullaniliyorum\n";
                yazici.write(metin);
                yazici.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            try {
                FileReader yeniokuyucu = new FileReader(denemeMetni);
                char[] arakatman = new char[(int)denemeMetni.length()];
                yeniokuyucu.read(arakatman);
                String okunanveri = new String(arakatman);
                System.out.println("\nokunan veriler:\n" + okunanveri);
                yeniokuyucu.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                denemeMetni.createNewFile();
            }
            catch (IOException Veritipi) {
                Veritipi.printStackTrace();
            }
            System.out.println(denemeMetni.getName() + " İsimli Dosya oluşturuldu.  Adresi: " + denemeMetni.getAbsolutePath());
        }
        try {
            Derste_Anlatilan_Kisim.main();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        File_byte_Tabanli.main();
        Buffered_Reader_Writer.main();
        Rasgele_Erisimli.main();
    }
}
