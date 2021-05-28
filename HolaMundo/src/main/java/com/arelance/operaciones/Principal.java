/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.operaciones;
/**
 *
 * @author Admin
 */
public class Principal {
    
    static String persona="Fran";
    
    public static void main(String[] args) {
        System.out.println(persona);
        System.out.println(personaX());
        System.out.println(personaY());
    }
    
    public static String personaX(){
        persona="Pepe";
        return persona;
    }
    
    public static String personaY(){
        persona="Juan";
        return persona;
    }
    
}
