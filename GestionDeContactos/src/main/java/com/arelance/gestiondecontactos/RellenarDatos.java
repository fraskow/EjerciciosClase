/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestiondecontactos;

import java.util.Scanner;

/**
 *
 * @author frans
 */
public class RellenarDatos {

    public static String rellenarDatos(String msg) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(msg);
        return teclado.next();
    }

}
