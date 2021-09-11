/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri_yapilari_detayli_ornekler;

/**
 *
 * @author bahad
 */
public class Queue_Yapisi_Detayli {
    public static void main(String[] args) {
        int i;
        my_special_Queue queue = new my_special_Queue(4);
        queue.Enqueque(1);
        queue.Enqueque(2);
        queue.Enqueque(3);
        queue.Enqueque(4);
        queue.Enqueque(5);
        for (i = 0; i < queue.maxSize; ++i) {
            System.out.println("i1: " + queue.ArrayQueue[i]);
        }
        queue.Dequeue();
        queue.Dequeue();
        queue.Dequeue();
        queue.Dequeue();
        queue.Dequeue();
        System.out.println("\n\u0130ncele\n");
        queue.Enqueque(1);
        queue.Enqueque(2);
        queue.Enqueque(3);
        queue.Enqueque(4);
        queue.Enqueque(5);
        queue.Dequeue();
        queue.Enqueque(5);
        for (i = 0; i < queue.maxSize; ++i) {
            System.out.println("i7: " + queue.ArrayQueue[i]);
        }
    }
}
