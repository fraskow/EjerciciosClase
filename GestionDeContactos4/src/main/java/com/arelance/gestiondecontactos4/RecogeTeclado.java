/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestiondecontactos4;

import java.util.Scanner;

/**
 *
 * @author frans
 */
public class RecogeTeclado {
    public static String recogeTecladoS(String msg) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(msg);
        return teclado.next();
    }
    public static int recogeTecladoI(String msg){
        Scanner teclado = new Scanner(System.in);
        System.out.println(msg);
        return teclado.nextInt();
    }
}
