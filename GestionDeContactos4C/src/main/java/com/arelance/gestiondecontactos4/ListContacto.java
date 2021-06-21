/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestiondecontactos4;

import java.util.Collections;

/**
 *
 * @author frans
 */
public class ListContacto {

    public static void mostrar() {
        if (ContactoHelper.contacts.isEmpty()) {
            System.out.println("Agenda vacía");
        } else {
            Collections.sort(ContactoHelper.contacts);
            //System.out.println(ContactoHelper.contacts);
            ContactoHelper.contacts.forEach(p -> {
                System.out.println("nombre:" + p.nombre + " telefono:" + p.telefono + " email:" + p.email);
            });
        }
    }
}
