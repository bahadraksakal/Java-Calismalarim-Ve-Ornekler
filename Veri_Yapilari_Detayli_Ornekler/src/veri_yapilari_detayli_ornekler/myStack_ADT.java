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
class myStack_ADT<T> {
    private int maxsize;
    private Object[] stacksArray;
    private int dynamicIndex;

    public myStack_ADT(int size) {
        this.maxsize = size;
        this.stacksArray = new Object[this.maxsize];
        this.dynamicIndex = -1;
    }

    public void push(Object newItem) {
        if (this.isFull()) {
            System.out.println("Stack tamamen doldu");
            return;
        }
        ++this.dynamicIndex;
        this.stacksArray[this.dynamicIndex] = newItem;
    }

    public boolean isFull() {
        return this.dynamicIndex == this.maxsize - 1;
    }

    public T pop() {
        if (this.isEmpty()) {
            System.out.println("Stack tamamen bo\u015f");
            return null;
        }
        Object item = this.stacksArray[this.dynamicIndex];
        this.stacksArray[this.dynamicIndex] = null;
        --this.dynamicIndex;
        return (T)item;
    }

    public boolean isEmpty() {
        return this.dynamicIndex == -1;
    }
}
