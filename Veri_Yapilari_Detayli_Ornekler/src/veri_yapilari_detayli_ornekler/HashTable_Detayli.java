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
public class HashTable_Detayli {
    public static void main(String[] args) {
        HashTableArray test = new HashTableArray(6);
        test.put(11, (Object)"ali");
        test.put(11, (Object)"bahadr");
        test.put(12, (Object)"ekrem");
        test.put(13, (Object)"abuzer");
        System.out.println((String)test.get(11));
    }
}
