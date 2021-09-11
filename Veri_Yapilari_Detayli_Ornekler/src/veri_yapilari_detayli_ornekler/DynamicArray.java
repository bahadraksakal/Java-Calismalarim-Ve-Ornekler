/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri_yapilari_detayli_ornekler;

import java.util.Arrays;

/**
 *
 * @author bahad
 */
class DynamicArray<T> {
    private int size;
    private Object[] data = new Object[1];

    public int getSize() {
        return this.data.length;
    }

    public T get(int index) {
        return (T)this.data[index];
    }

    public void put(Object element) {
        this.ensureCapacity(this.size + 1);
        this.data[this.size++] = element;
    }

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = this.data.length;
        if (oldCapacity < minCapacity) {
            this.data = Arrays.copyOf(this.data, oldCapacity * 2);
        }
    }
}
