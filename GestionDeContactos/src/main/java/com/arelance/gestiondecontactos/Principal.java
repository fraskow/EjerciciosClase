package com.arelance.gestiondecontactos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Principal {

    public static Scanner teclado = new Scanner(System.in);
    //private int contador = -1;
    private static final int NUMAX = 5;
    public static int contador = -1;
    private static final String[][] contactos = new String[NUMAX][];

    //private static Contactos[] contactos = new Contactos[NUMAX];
    public static void añadirContacto() {
        if (contador < contactos.length - 1) {
            String telefono = RellenarDatos.rellenarDatos("Telefono = ");
            String nombre = RellenarDatos.rellenarDatos("Nombre = ");
            String email = RellenarDatos.rellenarDatos("Email = ");
            String[] datos = {telefono, nombre, email};
            contactos[++contador] = datos;
        } else {
            System.out.println("No hay espacio disponible");
        }
        Menu.menu();
    }

    public static void mostrarAgenda() {
        for (int i = 0; i < contador + 1; i++) {
            System.out.println("^^^^^^^^^^^^^^^^^^");
            System.out.println("Contacto" + i);
            for (String contacto : contactos[i]) {
                System.out.println(contacto);
            }
        }
        Menu.menu();
    }

    public static void consultarContacto() {
        int index = parseInt(RellenarDatos.rellenarDatos("Introduce el índice para consultar"));
        for (int i = 0; i < contactos[0].length; i++) {
            System.out.println("Contacto" + i + contactos[index][i]);
        }
    }

    public static void eliminarContacto() {
        int index = parseInt(RellenarDatos.rellenarDatos("Indice de contacto a eliminar"));
        System.arraycopy(contactos, index + 1, contactos, index, contactos.length - 1 - index);
        contador--;
        Menu.menu();
    }
}
