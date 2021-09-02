package file_class_detayli;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class Rasgele_Erisimli {
    public static void main() {
        try {
            File f = new File("D:\\Belgeler\\NetBeansProjects\\File_class\\deneme-6.txt");
            RandomAccessFile f_random_access = new RandomAccessFile(f, "rw");
            String metin = "bu random access testidir\nBu test icin rasgele denemeler yapilicaktir";
            byte[] metin_byte = metin.getBytes();
            System.out.println("File pointer: " + f_random_access.getFilePointer());
            f_random_access.write(metin_byte);
            System.out.println("File pointer: " + f_random_access.getFilePointer());
            f_random_access.writeUTF("\nUTF-8 ıİçÇğĞüÜ\n");
            System.out.println("File pointer: " + f_random_access.getFilePointer());
            f_random_access.writeBytes("Selam UTF-8 var mı");
            System.out.println("File pointer: " + f_random_access.getFilePointer());
            f_random_access.seek(0L);
            System.out.println("(beklentim 0) File pointer: " + f_random_access.getFilePointer());
            byte tek_adet_char_byte = f_random_access.readByte();
            System.out.println("(beklentim 1) File pointer: " + f_random_access.getFilePointer());
            String tek_adet_satir = f_random_access.readLine();
            System.out.println("(neklentim 1+satirin byte'ı) File pointer: " + f_random_access.getFilePointer());
            f_random_access.seek(f.length());
            System.out.println("(beklentim max) File pointer: " + f_random_access.getFilePointer());
            f_random_access.seek(0L);
            System.out.println("(beklentim 0) File pointer: " + f_random_access.getFilePointer());
            byte[] metin_tamami = new byte[(int)f.length()];
            f_random_access.readFully(metin_tamami);
            System.out.println("1- " + (char)tek_adet_char_byte);
            System.out.println("2- " + tek_adet_satir);
            for (int i = 0; i < metin_tamami.length; ++i) {
                System.out.print((char)metin_tamami[i]);
            }
            f_random_access.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Dosya bulunamadı hatası");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
