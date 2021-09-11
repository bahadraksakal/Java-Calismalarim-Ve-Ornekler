/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri_yapilari_detayli_ornekler;

import java.util.Arrays;

/**
 *
 * @author bahad
 */
public class Arrayler {
    public static void main(String[] args) {
        int[] array = new int[500000];
        long startTime = System.nanoTime();
        for (int i = 0; i < array.length; ++i) {
            array[i] = i;
        }
        long secondTime = System.nanoTime();
        System.out.println("bir adet for luup ve arrayin \u00e7al\u0131\u015fma zaman\u0131 " + (secondTime - startTime));
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        String s_array1 = Arrays.toString(array1);
        System.out.println("\ns_array1 foor loop olmadan :        " + s_array1);
        String[] s_array2 = new String[]{"a", "b", "c", "d", "e", "f"};
        Character[] c_array0 = new Character[]{Character.valueOf('a'), Character.valueOf('b'), Character.valueOf('c'), Character.valueOf('d'), Character.valueOf('e')};
        char[] c_array1 = new char[]{'a', 'b', 'c', 'd', 'e'};
        Integer[] array2 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        boolean kontrol0 = Arrays.asList(new int[][]{array1}).contains(12);
        boolean kontrol1 = Arrays.asList(s_array2).contains("e");
        boolean kontrol2 = Arrays.asList(c_array0).contains(Character.valueOf('d'));
        boolean kontrol3 = Arrays.asList(new char[][]{c_array1}).contains(Character.valueOf('d'));
        boolean kontrol4 = Arrays.asList(array2).contains(13);
        System.out.println("\nkontrol0 : " + kontrol0);
        System.out.println("kontrol1 : " + kontrol1);
        System.out.println("kontrol2 : " + kontrol2);
        System.out.println("kontrol3 : " + kontrol3);
        System.out.println("kontrol4 : " + kontrol4);
        System.out.println("");
        int tabanuzunluk = 20;
        int m = -1;
        for (int i = 1; i < tabanuzunluk; i += 2) {
            for (int k = 0; k < (tabanuzunluk % 2 == 0 ? (tabanuzunluk - 2) / 2 - i / 2 : tabanuzunluk - 0 - i / 2); ++k) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; ++j) {
                System.out.print("*");
            }
            ++m;
            System.out.println("");
        }
    }
}
