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
class my_special_Queue<T> {
    Object[] ArrayQueue;
    int sonuncu_eleman;
    int front;
    int maxSize;
    int nItems;
    int rear;

    public my_special_Queue(int size) {
        this.maxSize = size;
        this.ArrayQueue = new Object[this.maxSize];
        this.sonuncu_eleman = this.maxSize - 1;
        this.rear = -1;
        this.nItems = 0;
        this.front = this.maxSize - 1;
    }

    public void Enqueque(Object element) {
        if (this.isFull()) {
            System.out.println("queue dolu");
            return;
        }
        ++this.nItems;
        this.rear = this.sonuncu_eleman;
        this.ArrayQueue[this.sonuncu_eleman--] = element;
        if (this.sonuncu_eleman == -1) {
            this.sonuncu_eleman = this.maxSize - 1;
        }
    }

    public boolean isFull() {
        return this.nItems == this.maxSize;
    }

    public void Dequeue() {
        if (this.isEmpty()) {
            System.out.println("Queue bo\u015f");
            return;
        }
        this.ArrayQueue[this.front] = null;
        --this.front;
        --this.nItems;
        if (this.front == -1) {
            this.front = this.maxSize - 1;
        }
    }

    public boolean isEmpty() {
        return this.nItems == 0;
    }
}
