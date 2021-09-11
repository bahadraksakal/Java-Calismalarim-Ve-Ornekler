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
class My_Special_Linked_List<T> {
    Node DynamicHeadNode;

    public void add(T data) {
        this.DynamicHeadNode = this.DynamicHeadNode == null ? new Node(data, null) : new Node(data, this.DynamicHeadNode);
    }

    public void delete() {
        this.DynamicHeadNode = this.DynamicHeadNode.Node_Pointer;
    }

    public void Display() {
        Node TempNode = this.DynamicHeadNode;
        while (TempNode.Node_Pointer != null) {
            System.out.print(TempNode.data + ", ");
            TempNode = TempNode.Node_Pointer;
        }
        System.out.print(TempNode.data + ", ");
    }
}
