package com.arelance.gestiondecontactos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Principal {
    
    //Solucion minima = array bidimensional
    //sobresaliente = orientarlo a objetos
    
    //empieza por hacelro bidimensional y despues intenta orientarlo a objetos.
    
    
    public static Scanner teclado = new Scanner(System.in);
    //private int contador = -1;
    private static final int NUMAX = 2;
    private static final String[][] contactos = new String[NUMAX][3];
    private static final String[] datos = {"telefono","nombre","email"};
    //private static Contactos[] contactos = new Contactos[NUMAX];
    
    public static void rellenarDatos(){
        for (int i = 0; i < contactos.length; i++) {
            for (int j = 0; j < contactos[i].length; j++) {
                System.out.println("Introduce el "+datos[j]);
                contactos[i][j]=teclado.nextLine();
            }
        }
        for (int i=0;i<contactos.length;i++){
            for (int j=0;j<contactos[i].length;j++){
                System.out.println(datos[j]+ " " +contactos[i][j]);
            }
        }
    }
    public static void mostrarAgenda() {
        
    }
    
    public static void consultarContacto(){
        
    }
    
    public static void eliminarContacto(){
        
    }
    
    public static void main(String[] args) {
        mostrarAgenda();
    }
}