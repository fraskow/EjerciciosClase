/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestiondecontactos4;

import java.util.ArrayList;

/**
 *
 * @author frans
 */
public class DeleteContacto {
    //mezcla de vista y lógica. No debe de ser estático no está bien localizado.
    //Mejor con un retorno del tipo Contacto
    public static void borrar() {
        if (ContactoHelper.contacts.isEmpty()) {
            System.out.println("No hay nada que borrar");
        } else {
            //no hay control de validación sobre un index fuera de rango
            int index = RecogeTeclado.recogeTecladoI("Indice de contacto a eliminar");
            //este array sobra es locl y solo borras de uno en uno
            ArrayList<Contacto> borrados = new ArrayList<>();
            borrados.add(ContactoHelper.contacts.remove(index));
            System.out.println("Los contactos borrados son "+borrados);
        }
    }
}
