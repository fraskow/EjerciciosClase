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
public class SearchContacto {
    //mezcla de vista y lógica. No debe de ser estático no está bien localizado.
    // debe retornar el contacto
    public static void consultar() {
        //esta validación está repetida en borrar solo cambia el mensaje
        if (ContactoHelper.contacts.isEmpty()) {
            System.out.println("No puedes buscar en una agenda vacía");
        } else {
           
            String nameComp = RecogeTeclado.recogeTecladoS("Nombre a buscar");
            String teleComp = RecogeTeclado.recogeTecladoS("Telefono a buscar");
            String emailComp = RecogeTeclado.recogeTecladoS("Email a buscar");
            Contacto comparacion = new Contacto(nameComp, teleComp, emailComp);

            if (ContactoHelper.contacts.contains(comparacion)) {
                System.out.println(comparacion.toString());
            } else {
                System.out.println("No existe");
            }
        }

    }

}
