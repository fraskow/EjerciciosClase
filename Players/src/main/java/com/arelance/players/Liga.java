/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.players;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Liga {
    
    private static Liga liga;
    private static final  int maximo=8;
    private static final Jugador[] jugadores = new Jugador[maximo];
    public Liga(){
        rellenarJugadores();
    }
    
    public static Liga getInstance(){
        if (liga==null){
        return liga = new Liga();
        }
        return liga;
    }
    
    private static void rellenarJugadores(){
        String [] nombres = {"luis","romulo","tete","qeqeq","rrrrrr","fffffua","juan","pepe"};
        for (int i=0;i<maximo;i++){
            jugadores[i]= new Jugador(nombres[i],(int)Math.floor(Math.random()*9+1));
        }
    }
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(jugadores));
    }
}
