/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.calcucommand.teclado;

import java.util.Scanner;

/**
 *
 * @author frans
 */
public class RecogeTeclado {
    
    public static int recogeTeclado(String msg){
        Scanner imput = new Scanner (System.in);
        System.out.println(msg);
        return imput.nextInt();
    }
    
}
