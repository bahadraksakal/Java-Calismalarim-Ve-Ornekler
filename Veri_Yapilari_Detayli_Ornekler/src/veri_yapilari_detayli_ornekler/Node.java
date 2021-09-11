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
class Node {
    Object data;
    Node Node_Pointer;

    public Node(Object data, Node Node_Pointer) {
        this.data = data;
        this.Node_Pointer = Node_Pointer;
    }
}
