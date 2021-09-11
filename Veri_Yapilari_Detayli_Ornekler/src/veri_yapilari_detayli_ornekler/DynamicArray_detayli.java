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
public class DynamicArray_detayli {
    public static void main(String[] args) {
        DynamicArray yeni_dizi = new DynamicArray();
        System.out.println("dizinin boyutu: " + yeni_dizi.getSize());
        yeni_dizi.put(1);
        System.out.println("dizinin boyutu: " + yeni_dizi.getSize());
        yeni_dizi.put(2);
        System.out.println("dizinin boyutu: " + yeni_dizi.getSize());
        yeni_dizi.put(3);
        System.out.println("dizinin boyutu: " + yeni_dizi.getSize());
        yeni_dizi.put(4);
        System.out.println("dizinin boyutu: " + yeni_dizi.getSize());
        yeni_dizi.put(5);
        System.out.println("dizinin boyutu: " + yeni_dizi.getSize());
        yeni_dizi.put(6);
        System.out.println("dizinin boyutu: " + yeni_dizi.getSize());
        yeni_dizi.put(7);
        System.out.println("dizinin boyutu: " + yeni_dizi.getSize());
        yeni_dizi.put(8);
        System.out.println("dizinin boyutu: " + yeni_dizi.getSize());
        yeni_dizi.put(9);
        System.out.println("dizinin boyutu: " + yeni_dizi.getSize());
        for (int i = 0; i < yeni_dizi.getSize(); ++i) {
            System.out.print(yeni_dizi.get(i) + ",");
        }
    }
}
