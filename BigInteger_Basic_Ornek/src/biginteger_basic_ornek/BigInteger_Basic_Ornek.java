/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biginteger_basic_ornek;

import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author bahad
 */
public class BigInteger_Basic_Ornek {


    public static void main(String[] args) {
        Random rast;
        BigInteger a;
        BigInteger b;
        BigInteger c;
        BigInteger a_eksi_bir_icin;
        BigInteger a1;
        BigInteger b_eksi_bir_icin;
        BigInteger d;
        rast = new Random();
        a = BigInteger.probablePrime(128, rast);
        System.out.println("a: "+a);
        b = BigInteger.probablePrime(128, rast);
        System.out.println("b: "+b);
        c = a.multiply(b);
        System.out.println("c: "+c);
        a_eksi_bir_icin = BigInteger.valueOf(1L);
        System.out.println("a_eksi_bir_icin: "+a_eksi_bir_icin);
        a1 = a.subtract(a_eksi_bir_icin);
        System.out.println("(yeni) a1"+a1);
        b_eksi_bir_icin = b.subtract(a_eksi_bir_icin);
        System.out.println("b_eksi_bir_icin : "+b_eksi_bir_icin);
    }
}
