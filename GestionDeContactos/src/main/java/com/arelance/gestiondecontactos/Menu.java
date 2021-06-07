/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestiondecontactos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {

    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        boolean condicion = false;
        int x;

        while (!condicion) {
            System.out.println("1)Añadir 2)Mostrar agenda 3)Constulta contacto 4)Borrar contacto 5)Salir");
            try {
                System.out.println("Introduce una opción");
                x = teclado.nextInt();
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
                        System.out.println("Consultar contacto");
                        Principal.consultarContactos();
                        break;
                    case 4:
                        System.out.println("Eliminar contacto");
                        Principal.eliminarContacto();
                        break;
                    case 5:
                        System.out.println("Saliste del menú");
                        condicion = true;
                        break;
                    default:
                        System.out.println("Pulsaste una opción incorrecta");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes pulsar un número");
                menu();
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
