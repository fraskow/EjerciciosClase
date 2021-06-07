package com.arelance.gestiondecontactos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.lang.Integer.parseInt;

/**
 *
 * @author Admin
 */
public class Principal {

    private static final int NUMAX = 5;
    public static int contador = -1;
    private static final String[][] contactos = new String[NUMAX][];

    public static void añadirContacto() {
        if (contador < contactos.length - 1) {
            String telefono = RellenarDatos.rellenarDatos("Telefono = ");
            String nombre = RellenarDatos.rellenarDatos("Nombre = ");
            String email = RellenarDatos.rellenarDatos("Email = ");
            String[] datos = {telefono, nombre, email};
            contactos[++contador] = datos;
            System.out.println("Contacto añadido");
        } else {
            System.out.println("No hay espacio disponible");
        }
    }

    public static void mostrarAgenda() {
        if (contador == -1) {
            System.out.println("Agenda vacía");
        } else {
            for (int i = 0; i < contador + 1; i++) {
                System.out.println("^^^^^^^^^^^^^^^^^^");
                System.out.println("Contacto" + i);
                for (String contacto : contactos[i]) {
                    System.out.println(contacto);
                }
            }
        }
    }

    /*
    public static void consultarContactoID(){
        int index = parseInt(RellenarDatos.rellenarDatos("Introduce el índice para consultar"));
        for (int i = 0; i < contactos[0].length; i++) {
            System.out.println("Contacto " + index + " " + contactos[index][i]);
    }
     */
    public static void consultarContactos() {
        int index = 0;
        String comparacion = RellenarDatos.rellenarDatos("Introduce el dato a comparar para buscar el contacto");
        for (int i = 0; i < contador + 1; i++) {
            for (String contacto : contactos[i]) {
                if (contacto.equalsIgnoreCase(comparacion)) {
                    for (int k = 0; k < contactos[i].length; k++) {
                        System.out.println("Contacto " + index + " " + contactos[index][k]);
                    }
                }
            }
            index++;
        }
    }

    public static void eliminarContacto() {
        int index = parseInt(RellenarDatos.rellenarDatos("Indice de contacto a eliminar"));
        System.arraycopy(contactos, index + 1, contactos, index, contactos.length - 1 - index);
        contador--;
    }
}
