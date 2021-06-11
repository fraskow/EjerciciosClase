/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.brutalzone;

/**
 *
 * @author Admin
 */
public class Dummy {

    public static void main(String[] args) {
        Contexto a = Contexto.getInstance();
        Contexto b = Contexto.getInstance();
        System.out.println(a == b);
        Object c = new Object();
        System.out.println(a.getClass() == c);
        System.out.println(c instanceof Contexto);
        System.out.println(c instanceof Object);
    }
}
