/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.players;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Jugador {
   /* 
    private static Jugador jugador;
    
    public int dorsal;
    public String nombre;
    public String equipo;
    public boolean libre;
    public boolean titular;
    //public String posicion;
    
    
    public static int setDor(String msg){
        Scanner teclado=new Scanner(System.in);
        System.out.println(msg);
        return teclado.nextInt();
    }
    
    public static String setNom(String msg){
        Scanner teclado=new Scanner(System.in);
        System.out.println(msg);
        return teclado.next();
    }*/
    /*
    public static String setTeam(String msg){
        Scanner teclado=new Scanner(System.in);
        System.out.println(msg);
        return teclado.next();
    }
    
    /*public static String setPos(String msg){
        Scanner teclado=new Scanner(System.in);
        System.out.println(msg);
        return teclado.next();
    }
    
     
    Jugador(){
        jugador = new Jugador();
        nombre=setNom("Introduce el nombre");
        equipo=setTeam("Introduce el equipo");
        dorsal=setDor("Introduce el dorsal");
        titular=dorsal<9;
        libre=equipo==null;
        //posicion=getPos("Introduce la posicion del jugador");
    }   
    */
    
    String nombre;
    int dorsal;
    Jugador(String nombre, int dorsal){
        this.nombre=nombre;
        this.dorsal=dorsal;
    }
    public String getNombre(){
        return nombre;
    }
    public int getDor(){
        return dorsal;
    }
    public int setDor(){
        
    }
}
