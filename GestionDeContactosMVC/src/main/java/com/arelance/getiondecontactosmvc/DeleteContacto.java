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
public class DeleteContacto {
    public static void borrar() {
        int index = RecogeTeclado.recogeTecladoI("Indice de contacto a eliminar");
        System.arraycopy(ContactoHelper.contactos, index + 1, ContactoHelper.contactos, index, ContactoHelper.contactos.length - 1 - index);
        Controller.contador--;
    }
}
