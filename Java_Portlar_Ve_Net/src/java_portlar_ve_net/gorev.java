package java_portlar_ve_net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author bahad
 */
public class gorev implements Runnable {
    Socket ahmet;
    DataInputStream dis;
    DataOutputStream dos;

    public gorev(Socket ahmet) {
        this.ahmet = ahmet;
    }

    @Override
    public void run() {
        try {
            this.dis = new DataInputStream(this.ahmet.getInputStream());
            this.dos = new DataOutputStream(this.ahmet.getOutputStream());
            double yaricap = this.dis.readDouble();
            System.out.println("Veri geldi: " + yaricap);
            double alan = yaricap * yaricap * Math.PI;
            this.dos.writeDouble(alan);
            System.out.println("Alan hesaplandi: " + alan);
            Thread.sleep(30000L);
            this.ahmet.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }    
}
