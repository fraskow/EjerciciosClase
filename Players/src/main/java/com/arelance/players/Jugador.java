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
    public String nombre;
    public String apellido;
    public int dorsal;
    public String equipo;
    public boolean titular;
    
    public static int getDor(String msg){
        Scanner teclado=new Scanner(System.in);
        System.out.println(msg);
        return teclado.nextInt();
    }
     public static String getNom(String msg){
        Scanner teclado=new Scanner(System.in);
        System.out.println(msg);
        return teclado.next();
    }
     public static String getApe(String msg){
        Scanner teclado=new Scanner(System.in);
        System.out.println(msg);
        return teclado.next();
    }
     public static String getTeam(String msg){
        Scanner teclado=new Scanner(System.in);
        System.out.println(msg);
        return teclado.next();
    }
     
    Jugador(){
        nombre=getNom("Introduce el nombre");
        apellido=getApe("Introduce el apellido");
        equipo=getTeam("Introduce el equipo");
        dorsal=getDor("Introduce el dorsal");
        titular=dorsal<9;
    }
}
