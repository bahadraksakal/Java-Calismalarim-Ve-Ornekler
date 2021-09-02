/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math_fonk_basic_ornek;

/**
 *
 * @author bahad
 */
public class Math_Fonk_Basic_Ornek {

    static int f(int x) {
        return 5 * x + 3;
    }

    static int g(int x) {
        return 3 * x - 5;
    }

    public static void main(String[] args) {
        System.out.println(Math_Fonk_Basic_Ornek.f(Math_Fonk_Basic_Ornek.g(3)));
        Math_Fonk_Basic_Ornek.yaz();
    }

    static void yaz() {
        System.out.println("merhaba bahadır");
    }
    
}
