package file_class_detayli;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class Buffered_Reader_Writer {
    public static void main() {
        try {
            File f = new File("D:\\Belgeler\\NetBeansProjects\\File_class\\deneme-5.txt");
            FileWriter fw = new FileWriter(f, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("bu bir deneme yazisisdir");
            bw.flush();
            bw.close();
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String satir = br.readLine();
            while (satir != null) {
                System.out.println(satir);
                satir = br.readLine();
            }
            br.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
