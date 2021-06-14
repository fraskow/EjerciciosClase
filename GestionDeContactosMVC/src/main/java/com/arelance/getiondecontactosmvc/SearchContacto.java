/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.getiondecontactosmvc;

/**
 *
 * @author frans
 */
public class SearchContacto {
    public static void consultarN() {
        String comparacion = RecogeTeclado.recogeTecladoS("Nombre del contacto a consultar");
        for (int i = 0; i < Controller.contador + 1; i++) {
            if (ContactoHelper.contactos[i].getNombre().equals(comparacion) == true) {
                System.out.println("El contacto consultado es " + ContactoHelper.contactos[i]);
            } else {
                System.out.println("No existe tal contacto");
            }
        }
    }
    public static void consultarT() {
        String comparacion = RecogeTeclado.recogeTecladoS("Telefono del contacto a consultar");
        for (int i = 0; i < Controller.contador + 1; i++) {
            if (ContactoHelper.contactos[i].getTelefono().equals(comparacion) == true) {
                System.out.println("El contacto consultado es " + ContactoHelper.contactos[i]);
            } else {
                System.out.println("No existe tal contacto");
            }
        }
    }
    public static void consultarE() {
        String comparacion = RecogeTeclado.recogeTecladoS("Email del contacto a consultar");
        for (int i = 0; i < Controller.contador + 1; i++) {
            if (ContactoHelper.contactos[i].getEmail().equals(comparacion) == true) {
                System.out.println("El contacto consultado es " + ContactoHelper.contactos[i]);
            } else {
                System.out.println("No existe tal contacto");
            }
        }
    }
}
