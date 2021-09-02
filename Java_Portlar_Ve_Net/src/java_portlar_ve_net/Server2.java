package java_portlar_ve_net;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author bahad
 */
public class Server2 {
    public static void main(String[] args) throws Exception {
        int port = 9200;
        System.out.println("Dinlemeye bağlandı...");
        ServerSocket ss = new ServerSocket(port);
        for (int i = 0; i < 10; ++i) {
            Socket s = ss.accept();
            System.out.println("Birisi bağlandı! Accept() ile yaratılan soketin portu: " + s.getLocalPort());
            gorev g = new gorev(s);
            Thread t = new Thread(g);
            t.start();
        }
        ss.close();
    }
}
