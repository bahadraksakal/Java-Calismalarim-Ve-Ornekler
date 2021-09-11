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
public class DoubleLinkedList {
    public static void main(String[] args) {
        My_Double_Linked_List myDoubleLinkedList = new My_Double_Linked_List();
        myDoubleLinkedList.add((Object)"bahadr");
        myDoubleLinkedList.add((Object)"levent");
        myDoubleLinkedList.add((Object)"rana");
        myDoubleLinkedList.add((Object)"taner");
        myDoubleLinkedList.add((Object)"ebru");
        myDoubleLinkedList.Re_Display();
        System.out.println("");
        myDoubleLinkedList.Display();
        System.out.println("");
        myDoubleLinkedList.delete();
        System.out.println("");
        myDoubleLinkedList.add((Object)"abuzer");
        myDoubleLinkedList.add((Object)"byking");
        System.out.println("");
        myDoubleLinkedList.Display();
        System.out.println("");
        myDoubleLinkedList.Re_Display();
    }
}
