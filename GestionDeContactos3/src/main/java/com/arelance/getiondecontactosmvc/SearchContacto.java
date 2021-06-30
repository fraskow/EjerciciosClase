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
// estas busqueda es mejor pasar un contacto a buscar y tener un segundo paramétro de un tipo enum para clasificar la busqueda y
// el enum lo usas su ordinar pra hacer una busqueda por columna con un bucle doble en el método y todo ok.
//con eso simplificas mucho.
//los String se pueden convertir en ejemplares de un enum  busca información sobre ello.
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
