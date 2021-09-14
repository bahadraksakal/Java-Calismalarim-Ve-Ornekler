/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_runnable_ornek;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author bahad
 */
public class gorev1 implements Runnable {
    artis artis_sayilar;
    public static Lock lock = new ReentrantLock();

    public gorev1(artis artis_nesnesi) {
        this.artis_sayilar = artis_nesnesi;
    }

    @Override
    public void run() {
        int temp = 0;
        while (this.artis_sayilar.a < this.artis_sayilar.c) {
            System.out.println("gorev_1  :  " + this.artis_sayilar.a);
            if (temp == this.artis_sayilar.b + 1) {
                temp = 0;
                lock.lock();
            }
            ++temp;
            ++this.artis_sayilar.a;
        }
    }
}
