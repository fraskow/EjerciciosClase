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

    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        boolean condicion = false;
        while (!condicion) {
            System.out.println("1)Añadir 2)Mostrar agenda 3)Constulta contacto 4)Borrar contacto 5)Salir");
            int x = teclado.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Añadir contacto");
                    Principal.añadirContacto();
                    break;
                case 2:
                    System.out.println("Mostrar agenda");
                    Principal.mostrarAgenda();
                    break;
                case 3:
                    System.out.println("Consultar contaco");
                    Principal.consultarContacto();
                    break;
                case 4:
                    System.out.println("Eliminar contacto");
                    Principal.eliminarContacto();
                    break;
                default:
                    System.out.println("Saliste del menú o seleccionaste una opción incorrecta");
                    condicion = true;
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
