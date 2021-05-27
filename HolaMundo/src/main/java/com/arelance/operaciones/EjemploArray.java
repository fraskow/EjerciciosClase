/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.operaciones;
import java.util.Arrays;
import java.util.List;
// import static java.util.Arrays.*;
// import java.lang.System.out;
/**
 *
 * @author Admin
 */
public class EjemploArray {
    public static void main(String[] args) {
        int suma=0;
        
        int [] numeros1 = {3,5,9};
        int [] numeros2 = new int []{5,3,2};
        int [] numeros3 = new int [3];
        List lista2=Arrays.asList(numeros1);
        System.out.println(lista2.get(0));
        
        Integer [] numeros4 = new Integer[3];
        List lista=Arrays.asList(numeros4);
        System.out.println(lista.get(0));
        
        for (int i=0; i<numeros1.length;i++){
            suma+=numeros1[i];
        }
        System.out.println(suma);
    }
}
