package com.arelance.gestiondecontactos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Principal {
    
    public static Scanner teclado = new Scanner(System.in);
    private static final int NUMAX = 2;
    private static Contactos[] contactos = new Contactos[NUMAX];
    
    public static List rellenarDatos(){
        String [] names = new String[NUMAX];
        String [] email = new String[NUMAX];
        for (int i=0; i<NUMAX;i++){
            int numeroTelef = (int)Math.floor(Math.random()*1000+1);
            System.out.println("Nombre contacto "+i);
            names[i]=teclado.next();
            System.out.println("Email contacto "+i);
            email[i]=teclado.next();
            contactos[i] = new Contactos(numeroTelef,names[i],email[i]);
        }
        List agenda = Arrays.asList(contactos);
        return agenda;
    }
    public static void mostrarAgenda() {
        System.out.println(rellenarDatos().toString());
    }
    
    public static void consultarAgenda(){
        List consultados = Arrays.asList(rellenarDatos().contains(teclado.next()));
        System.out.println("El contacto consultado es "+consultados.toString());
    }
    
    public static void eliminarDatos(){
        List deleted = Arrays.asList(rellenarDatos().remove(teclado.nextInt()));
        System.out.println("El contacto borrado es "+deleted.toString());
    }
}