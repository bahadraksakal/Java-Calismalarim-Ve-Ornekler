/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneserilestirme_externalizable_arayuzu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author bahad
 */
public class Serizable_arayuzu {
    public static void main(String[] args) {
        Scanner veri_al = new Scanner(System.in);
        String ad = veri_al.nextLine();
        int yas = veri_al.nextInt();
        Uyeler yeni_uye = new Uyeler(ad, yas);
        File f = new File("Data_Base_Uyeler.txt");
        try {
            FileOutputStream f_oStream = new FileOutputStream(f, false);
            System.out.println("1");
            ObjectOutputStream o_oStream = new ObjectOutputStream(f_oStream);
            System.out.println("2");
            o_oStream.writeObject((Object)yeni_uye);
            System.out.println("3");
            f_oStream.close();
            o_oStream.close();
            FileInputStream f_iStream = new FileInputStream(f);
            ObjectInputStream o_iStream = new ObjectInputStream(f_iStream);
            System.out.println("4");
           
                yeni_uye = (Uyeler)o_iStream.readObject();
                System.out.println(yeni_uye.get_ad());
                System.out.println(yeni_uye.get_yas());
          
            System.out.println("5");
            f_iStream.close();
             System.out.println("6");
            o_iStream.close();
             System.out.println("7");
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
