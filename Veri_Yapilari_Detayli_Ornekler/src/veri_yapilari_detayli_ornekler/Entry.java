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
class Entry {
    int key;
    Object value;
    Entry next;

    public Entry() {
        this.next = null;
    }

    public Entry(int key, Object value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public int getKey() {
        return this.key;
    }

    public Object getValue() {
        return this.value;
    }
}
