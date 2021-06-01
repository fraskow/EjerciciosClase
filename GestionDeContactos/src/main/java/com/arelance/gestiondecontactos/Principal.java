package com.arelance.gestiondecontactos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Principal {
    public static Scanner teclado = new Scanner(System.in);
    private static final int nuMax = 15;
    private static final Contactos[] contactos = new Contactos[nuMax];
    
    //ArrayList contactos = new ArrayList();
    //Contador
    //Condiciones para añadir
    //Eliminar por objetos.
    
    private static void añadirDatos(){
        
        String[] names={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
        String[] email={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
        for (int i=0; i<nuMax;i++){
            int numeroTelef = (int)Math.floor(Math.random()*1000+1);
            contactos[i] = new Contactos(numeroTelef,names[i],email[i]);
        }
    }
    public static void mostrarAgenda() {
        System.out.println(contactos);
    }
    
    public static void consultarAgenda(){
        
    }
    
    public static void eliminarDatos(){
        
    }
    
    public static void main(String[] args) {
        añadirDatos();
        mostrarAgenda();
    }    
}
