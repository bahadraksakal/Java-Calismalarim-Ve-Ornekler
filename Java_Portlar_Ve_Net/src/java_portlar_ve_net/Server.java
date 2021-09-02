package java_portlar_ve_net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author bahad
 */
public class Server {
    public static void main(String[] args) throws Exception {
        int port = 9200;
        System.out.println("Dinlemeye bağlandı...");
        ServerSocket ss = new ServerSocket(port);
        Socket s = ss.accept();
        System.out.println("Birisi bağlandı!");
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        double yaricap = dis.readDouble();
        System.out.println("Veri geldi: " + yaricap);
        double alan = yaricap * yaricap * Math.PI;
        dos.writeDouble(alan);
        System.out.println("Alan hesaplandi: " + alan);
    }
}
