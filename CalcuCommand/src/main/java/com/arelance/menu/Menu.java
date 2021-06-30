/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.menu;

import com.arelance.calcucommand.teclado.RecogeTeclado;
import java.util.InputMismatchException;

/**
 *
 * @author frans
 */
public class Menu {

    public static void menu() {
        while (true) {
            int opcion;
            System.out.println("Elige 1)suma 2)resta 3)multiplicacion 4)divsion");
            try {
                opcion = RecogeTeclado.recogeTeclado("Selecciona una opcion");
                switch (opcion) {
                    case 1:
                        System.out.println("sumando");
                    case 2:
                        System.out.println("restando");
                    case 3:
                        System.out.println("multiplicando");
                    case 4:
                        System.out.println("dividiendo");
                    default:
                        System.out.println("Selecciona una opcion válida");
                }

            } catch (InputMismatchException e) {
                System.out.println("Elige un número :)");
            }
        }
    }
}
