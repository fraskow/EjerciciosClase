package com.arelance.gestiondecontactos2;

import static java.lang.Integer.parseInt;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
// es muy monolítico
public class Principal {

    private static final int MAX = 5;
    private static final Contacto[] contactos = new Contacto[MAX];
    public static int contador = -1;

    public static void recogerDatos() {
        String nombre = RecogerTeclado.recogerTeclado("Introduce nombre");
        String telefono = RecogerTeclado.recogerTeclado("Introduce telefono");
        String email = RecogerTeclado.recogerTeclado("Introduce email");
        Contacto contacto = new Contacto(nombre, telefono, email);
        añadir(contacto);
        System.out.println("Contacto añadido");
    }

    public static void añadir(Contacto contacto) {
        contactos[++contador] = contacto;
    }

    public static void mostrar() {
        for (int i = 0; i < contador + 1; i++) {
            System.out.println(contactos[i].toString());
        }
    }

    public static void consultar() {
        String comparacion = RecogerTeclado.recogerTeclado("Nombre del contacto a buscar");
        for (int i = 0; i < contador + 1; i++) {
            if (contactos[i].getNombre().equals(comparacion) == true) {
                System.out.println("El contacto consultado es " + contactos[i]);
            } else {
                System.out.println("No existe tal contacto");
            }
        }
    }

    public static void borrar() {
        int index = parseInt(RecogerTeclado.recogerTeclado("Indice de contacto a eliminar"));
        System.arraycopy(contactos, index + 1, contactos, index, contactos.length - 1 - index);
        contador--;
    }

}
