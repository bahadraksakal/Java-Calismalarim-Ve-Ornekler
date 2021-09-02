/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throws_try.catch_expection_ornekler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author bahad
 */
public class Coklu_Hata_yakalama {
    public static void main(String[] args) {
        byte[] okunanveri = new byte[1000];
        File f = new File("D:\\Belgeler\\NetBeansProjects\\Throws_Try-Catch_Expection_Ornekler\\src\\throws_try\\catch_expection_ornekler\\metin1.txt");
        try (FileInputStream dosyaOku = new FileInputStream(f);){
            dosyaOku.read(okunanveri);
            System.out.println(new String(okunanveri));
        }
        catch (FileNotFoundException eF) {
            System.out.println(eF.toString());
        }
        catch (IOException eIO) {
            System.out.println(eIO.toString());
        }
    }
}
