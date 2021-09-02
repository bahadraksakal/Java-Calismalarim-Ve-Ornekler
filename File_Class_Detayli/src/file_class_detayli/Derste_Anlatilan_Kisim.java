/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_class_detayli;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author bahad
 */
public class Derste_Anlatilan_Kisim {
    public static void main() throws FileNotFoundException {
        System.out.println("****Print_Writer****\n");
        File f = new File("D:\\Belgeler\\NetbeansProjects\\file_class\\deneme-3.txt");
        if (f.exists()) {
            System.out.println("Zaten böyle bir dosya var");
        } else {
            PrintWriter dosyaOlustur = new PrintWriter(f);
            dosyaOlustur.print("selam ben baho yasim: ");
            dosyaOlustur.println(20);
            dosyaOlustur.close();
        }
        try {
            FileWriter yazici = new FileWriter(f, true);
            yazici.write("selamın hello");
            yazici.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        Scanner Oku = new Scanner(f);
        while (Oku.hasNext()) {
            System.out.print(Oku.next() + "  ");
        }
        Oku.close();
    }
}
