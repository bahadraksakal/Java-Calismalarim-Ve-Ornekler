/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_runnable_ornek;

/**
 *
 * @author bahad
 */
public class Thread_Runnable_Ornek {

    public static void main(String[] args) {
        artis a = new artis(1, 2, 10);
        gorev1 g1 = new gorev1(a);
        gorev2 g2 = new gorev2(a);
        Thread t1 = new Thread((Runnable)g1);
        Thread t2 = new Thread((Runnable)g2);
        t1.start();
        t2.start();
    }
    
}
