/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestiondecontactos;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {
     public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("1)Añadir 2)Consultar contacto 3)Mostrar agenda 4)Borrar contacto 5)Salir");
        boolean condicion = false;
        while (!condicion){
            int x=teclado.nextInt();
            switch(x){  
                case 1: 
                    System.out.println("Añadir contacto");
                    Principal.rellenarDatos();
                    break;
                case 2: 
                    System.out.println("Consultar contacto");
                    Principal.consultarAgenda();
                    break;
                case 3: 
                    System.out.println("Mostrar Agenda");
                    Principal.mostrarAgenda();
                    break;
                case 4:
                    System.out.println("Eliminar contacto");
                    Principal.eliminarDatos();
                    break;
                default :
                    System.out.println("Saliste del menú o seleccionaste una opción incorrecta");
                    condicion=true;
            }
        }
    }
}
