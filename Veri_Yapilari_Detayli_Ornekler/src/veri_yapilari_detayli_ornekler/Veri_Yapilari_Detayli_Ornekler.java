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
public class Veri_Yapilari_Detayli_Ornekler {

    public static void main(String[] args) {
        myStack_ADT stack_0 = new myStack_ADT(5);
        stack_0.push(1);
        stack_0.push(2);
        stack_0.push(3);
        stack_0.push(4);
        stack_0.push(5);
        stack_0.push(6);
        while (!stack_0.isEmpty()) {
            System.out.println(stack_0.pop());
        }
        stack_0.pop();
    }
    
}
