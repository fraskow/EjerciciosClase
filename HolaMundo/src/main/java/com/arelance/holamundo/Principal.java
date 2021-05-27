/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.holamundo;

import static com.arelance.holamundo.Calculadora1.x;
import static com.arelance.holamundo.Calculadora1.y;
import static com.arelance.holamundo.Calculadora1.suma;
import static com.arelance.holamundo.Calculadora1.sumando;

/**
 *
 * @author Admin
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println(Calculadora1.sumar(x,y)); 
        for (int i=0;i<sumando.length;i++){
            suma+=sumando[i];
        }System.out.println(suma);
    }
}