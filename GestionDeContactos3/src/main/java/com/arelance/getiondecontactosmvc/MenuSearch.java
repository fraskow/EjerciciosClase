/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.getiondecontactosmvc;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author frans
 */
public class MenuSearch extends Menu{
    
    public static void menuSub() {
        Scanner teclado = new Scanner(System.in);
        while (!Controller.menuCondition) {
            System.out.println("1)Telefono 2)Nombre 3)Email 4)Salir");
            int x;
            try {
                x = teclado.nextInt();
                switch (x) {
                    case 1:
                        System.out.println("Por telefono");
                        SearchContacto.consultarT();
                        break;
                    case 2:
                        System.out.println("Por nombre");
                        SearchContacto.consultarN();
                        break;
                    case 3:
                        System.out.println("Por email");
                        SearchContacto.consultarE();
                        break;
                    case 4:
                        System.out.println("Saliste del menú de edición");
                        Menu.menu();
                        break;
                    default:
                        System.out.println("Pulsaste una opción incorrecta");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes pulsar un número");
                menuSub();
            }
        }
    }
}
