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
class HashTableArray<T> {
    Entry[] hashTableArray;
    int size;

    public HashTableArray(int size) {
        this.size = size;
        this.hashTableArray = new Entry[size];
        for (int i = 0; i < this.hashTableArray.length; ++i) {
            this.hashTableArray[i] = new Entry();
        }
    }

    int getHash(int key) {
        return key % this.size;
    }

    public void put(int key, Object value) {
        int HashIndex = this.getHash(key);
        Entry Array_value = this.hashTableArray[HashIndex];
        Entry newItem = new Entry(key, value);
        newItem.next = Array_value.next;
        Array_value.next = newItem;
    }

    public T get(int key) {
        Object value = null;
        int hashIndex = this.getHash(key);
        Entry arrayValue = this.hashTableArray[hashIndex];
        while (arrayValue != null) {
            if (arrayValue.getKey() == key) {
                value = arrayValue.getValue();
            }
            arrayValue = arrayValue.next;
        }
        return (T)value;
    }
}
