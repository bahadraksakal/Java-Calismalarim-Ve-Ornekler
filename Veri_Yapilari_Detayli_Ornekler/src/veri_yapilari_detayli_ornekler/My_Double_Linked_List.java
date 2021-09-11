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
class My_Double_Linked_List<T> {
    Node2 DynamicHeadNode;

    My_Double_Linked_List() {
    }

    public void add(T data) {
        if (this.DynamicHeadNode == null) {
            this.DynamicHeadNode = new Node2(data, null, null);
        } else {
            Node2 temp;
            this.DynamicHeadNode.Node_Pointer_previous = temp = new Node2(data, this.DynamicHeadNode, null);
            this.DynamicHeadNode = temp;
        }
    }

    public void delete() {
        this.DynamicHeadNode = this.DynamicHeadNode.Node_Pointer_next;
        this.DynamicHeadNode.Node_Pointer_previous = null;
    }

    public void Display() {
        Node2 TempNode = this.DynamicHeadNode;
        while (TempNode.Node_Pointer_next != null) {
            System.out.print(TempNode.data + ", ");
            TempNode = TempNode.Node_Pointer_next;
        }
        System.out.print(TempNode.data + ", ");
    }

    public void Re_Display() {
        Node2 TempNode = this.DynamicHeadNode;
        while (TempNode.Node_Pointer_next != null) {
            TempNode = TempNode.Node_Pointer_next;
        }
        while (TempNode.Node_Pointer_previous != null) {
            System.out.print(TempNode.data + ", ");
            TempNode = TempNode.Node_Pointer_previous;
        }
        System.out.print(TempNode.data + ", ");
    }
}
