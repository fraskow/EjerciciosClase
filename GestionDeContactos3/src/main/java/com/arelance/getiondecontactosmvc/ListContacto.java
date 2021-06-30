/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.getiondecontactosmvc;

/**
 *
 * @author Admin
 */
public class ListContacto {

    public static void mostrar() {
        if (Controller.contador == -1) {
            System.out.println("Agenda vacía");
        } else {
            
            for (int i = 0; i < Controller.contador + 1; i++) {
                System.out.println(ContactoHelper.contactos[i].toString());
            }
        }
    }
}
