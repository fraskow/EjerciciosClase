/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestiondecontactos4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author frans
 */
public class Menu {

    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        while (!Constants.menuCondition) {
            System.out.println("1)Añadir 2)Mostrar agenda 3)Constulta contacto 4)Borrar contacto 5)Salir");
            int x;
            try {
                x = teclado.nextInt();
                switch (x) {
                    case 1:
                        System.out.println("Añadir contacto");
                        AddContacto.recogerDatos();
                        break;
                    case 2:
                        System.out.println("Mostrar agenda");
                        ListContacto.mostrar();
                        break;
                    case 3:
                        System.out.println("Consultar contacto");
                        SearchContacto.consultar();
                        break;
                    case 4:
                        System.out.println("Eliminar contacto");
                        DeleteContacto.borrar();
                        break;
                    case 5:
                        System.out.println("Saliste del menú");
                        Constants.menuCondition = true;
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
}
