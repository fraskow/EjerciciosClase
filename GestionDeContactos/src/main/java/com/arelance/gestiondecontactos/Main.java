/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestiondecontactos;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Main {
    
    Scanner teclado = new Scanner(System.in);
    Integer contador;
    String[] ciudades = new String[4];
    
    public boolean add (String city){
        if(contador<ciudades.length-1){
            ciudades[++contador]=city;
            return true;
        }return false;
    }
    public boolean remove(Object obj){
        obj=teclado.next();
        return true;
    }
    
    //copiar array
    public static void main(String[] args) {
        
        Integer[] xxx = {1,2,3,4};
        Integer[] yyy = {5,6,7,8,9,10,11,12};
        System.arraycopy(xxx, 0, yyy, yyy.length/2, xxx.length);
        
        Integer[] ppp = {1,2,3,4,5};
        Integer[] rrr ={6,7,8,9,10};
        System.arraycopy(rrr, 0, ppp, ppp.length-3, 3);
        
        //imprimir arraycopied
        for (Integer integer : yyy) {
            System.out.println(integer);
        }
        
        //copiar array bidimensional
        String[][] zzz = new String[3][];
        zzz[0] = new String[]{"FRAN","1234"};
        zzz[1] = new String[]{"PEPE","5678"};
        zzz[2] = new String[]{"JUAN","abcd"};
        String[][] vvv = new String[zzz.length][];
        System.arraycopy(zzz, 0, vvv, 0, zzz.length);
        
        //ejercicio isi: ARRAY [CIUDADES][CODIGO POSTAL] -> Si borro un elemento de array principal Ciudades
        //el siguiente coge el elemento Codigo postal del borrado.
        //ejercicio isi 2: ARRAY [nombres][apellidos] 2 primeros nombres en apellidos;
        
        
        
        
        String[][] gente = new String[4][];
        String[][] genteNueva= new String[gente.length][];
        for (int i=0;i<=gente.length-1;i++){
            gente[i]=new String[]{"nombre"+i,"apellido"+i};
        }
        System.arraycopy(gente, 0, genteNueva, 0, gente.length);
        for (String[] strings : genteNueva) {
            System.out.println(Arrays.toString(strings));            
        }
    }
}
