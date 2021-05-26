/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.beans;
import java.util.Scanner ;
/**
 *
 * @author Admin
 */
public class Personas {
    public static String getPers(String msg){
        Scanner teclado = new Scanner(System.in);
        System.out.println(msg);
        return teclado.next();
    }
    
    public static void main (String[] args){
        System.out.println("El nombre completo de la persona listada es "+nombre()+" "+apellidos());
    }
    public static String nombre(){
        String name = getPers("Nombre de la persona");
        return name;
    }
    public static String apellidos(){
        String lName = getPers("Apellido de la persona");
        return lName;
    }
}
