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
public class DeleteContacto {
    
    public static void borrar(){
    if (ContactoHelper.contacts.isEmpty()) {
            System.out.println("No hay nada que borrar");
        } else {
            int index = RecogeTeclado.recogeTecladoI("Indice de contacto a eliminar");
            ContactoHelper.contacts.remove(index);
        }
    }
}
