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
class Node2 {
    Object data;
    Node2 Node_Pointer_next;
    Node2 Node_Pointer_previous;

    public Node2(Object data, Node2 Node_Pointer_next, Node2 Node_Pointer_previous) {
        this.data = data;
        this.Node_Pointer_next = Node_Pointer_next;
        this.Node_Pointer_previous = this.Node_Pointer_previous;
    }
}
