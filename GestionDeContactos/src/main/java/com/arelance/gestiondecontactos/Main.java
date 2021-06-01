/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestiondecontactos;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Main {
    
    Scanner teclado = new Scanner(System.in);
    //List<String> xxx = new ArrayList<>();
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
    
    
    public static void main(String[] args) {
        Integer[] ppp = {1,2,3,4,5};
        Integer[] rrr ={6,7,8,9,10};
        System.arraycopy(rrr, 1, rrr, 0, rrr.length-1);
    }
    
    
    
    
    
}
