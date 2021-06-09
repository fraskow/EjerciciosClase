/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestiondecontactos2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class RecogerTeclado {
    public static String recogerTeclado(String msg) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(msg);
        return teclado.next();
    }
}
