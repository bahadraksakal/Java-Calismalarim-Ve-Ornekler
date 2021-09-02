package java_portlar_ve_net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author bahad
 */
public class Client2 {
    public static void main(String[] args) throws Exception {
        int port = 9200;
        Socket s = new Socket("localhost", port);
        System.out.println("Socket yaratıldı. Port: " + s.getLocalPort());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeDouble(5.3);
        System.out.println("Veri gönderildi. Cevap bekleniyor.");
        double cevap = dis.readDouble();
        System.out.println("Gelen cevap: " + cevap);
    }
}
