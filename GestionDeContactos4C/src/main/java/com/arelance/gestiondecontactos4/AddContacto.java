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
    //hay que generarse el conjunto de vistas junto y todas son del mismo tipo
    //al tener el método añadir dentro no puedes hacer una jerarqía de vistas.
    public static void recogerDatos() {
        String nombre = RecogeTeclado.recogeTecladoS("Introduce nombre");
        String telefono = RecogeTeclado.recogeTecladoS("Introduce telefono");
        String email = RecogeTeclado.recogeTecladoS("Introduce email");
        Contacto contacto = new Contacto(nombre, telefono, email);
        añadir(contacto);
        System.out.println("Contacto añadido");
    }
    //añadir, borrar etc... es el CRUD y deben ir todos juntos
    public static void añadir(Contacto contacto) {
        ContactoHelper.contacts.add(contacto);
    }
}
