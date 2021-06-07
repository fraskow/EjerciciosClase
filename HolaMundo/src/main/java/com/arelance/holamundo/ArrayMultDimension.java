/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.holamundo;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class ArrayMultDimension {
    
    static int contador = 0;
    
    public static void main(String[] args) {
        
        Integer [][] datos = new Integer [3][3]; //arrays multidimensionales
        /*for (int i=0;i<datos.length;i++){
            for (int j=0; j<datos[i].length; j++){
                contador+=2;
                datos[i][j]=contador;
                System.out.println(datos[i][j]);
            }
        }
        int contadorB = 1;
        for (int k=0;k<datos.length;k++){
            for (int l=0;l<datos[k].length;l++){
                datos[k][l]=contadorB++;
                System.out.println(datos[k][l]);
            }
        }*/
        System.out.println(Arrays.asList(rellenar(datos)));
    }
    
    public static Integer[][] rellenar(Integer[][] datos) {
        datos = new Integer[2][];
        
        for (int i=0;i<datos.length;i++){
            Integer[] x = {contador+=2,contador+=2,contador+=2};
            datos[i]=x;
        }
        return datos;
    }
}
