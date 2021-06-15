/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestiondecontactos4;

/**
 *
 * @author frans
 */
public class AddContacto {
    public static void recogerDatos() {
        String nombre = RecogeTeclado.recogeTecladoS("Introduce nombre");
        String telefono = RecogeTeclado.recogeTecladoS("Introduce telefono");
        String email = RecogeTeclado.recogeTecladoS("Introduce email");
        Contacto contacto = new Contacto(nombre, telefono, email);
        añadir(contacto);
        System.out.println("Contacto añadido");
    }
    
    public static void añadir(Contacto contacto) {
        ContactoHelper.contacts.add(contacto);
    }
}
