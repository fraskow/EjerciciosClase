/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.holamundo;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Calculadora2 {
    static double x=getNum("Introduce un valor");
    static double y=getNum("Introduce siguiente valor");
    
    private static double getNum(String msg){
        Scanner teclado = new Scanner(System.in);
        System.out.println(msg);
        return teclado.nextDouble();
    }
    public static void main(String[] args){
        double sumar=x+y;
        System.out.println("La suma de "+x+" y "+y+" es = "+sumar);
        double restar=x-y;
        System.out.println("La resta de "+x+" y "+y+" es = "+restar);
        double mult=x*y;
        System.out.println("La multiplicación de "+x+" y "+y+" es = "+mult);
        double div=x/y;
        System.out.println("La división de "+x+" y "+y+" es = "+div);
        if(x>y){
            System.out.println(x+" es mayor que "+y);
        }else System.out.println(y+" es mayor que "+x);
        if(sumar>100){
            System.out.println("La suma supera el valor 100");
        }else System.out.println("La suma no supera el valor 100");
    }
}