
package nesneserilestirme_externalizable_arayuzu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class NesneSerilestirme_Externalizable_Arayuzu {

    public static void main(String[] args) {
        ogrenci ogrenci_1 = new ogrenci("ali", "kaptan");
        try {
            FileOutputStream f_out = new FileOutputStream("D:\\Belgeler\\NetBeansProjects\\NesneSerilestirme_Externalizable_Arayuzu\\Nesne.txt");
            ObjectOutputStream o1 = new ObjectOutputStream(f_out);
            o1.writeObject(ogrenci_1);
        }
        catch (IOException i) {
            i.printStackTrace();
        }
        ogrenci ogrenci_1_De_Ser = null;
        try {
            FileInputStream f_Int = new FileInputStream("D:\\Belgeler\\NetBeansProjects\\NesneSerilestirme_Externalizable_Arayuzu\\Nesne.txt");
            ObjectInputStream obje_input = new ObjectInputStream(f_Int);
            ogrenci_1_De_Ser = (ogrenci)obje_input.readObject();
        }
        catch (IOException i) {
            i.printStackTrace();
        }
        catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        System.out.println("ad: " + ogrenci_1_De_Ser.getter_ad() + "   Soyad: " + ogrenci_1_De_Ser.getter_soyad());
    }
    
}
