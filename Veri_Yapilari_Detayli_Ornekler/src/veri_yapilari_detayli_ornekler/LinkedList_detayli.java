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
public class LinkedList_detayli {
    public static void main(String[] args) {
        My_Special_Linked_List mylist = new My_Special_Linked_List();
        mylist.add((Object)"bahadr");
        mylist.add((Object)"levent");
        mylist.add((Object)"rana");
        mylist.add((Object)"taner");
        mylist.add((Object)"ebru");
        mylist.Display();
        System.out.println("");
        mylist.delete();
        System.out.println("");
        mylist.add((Object)"abuzer");
        System.out.println("");
        mylist.Display();
    }
}
