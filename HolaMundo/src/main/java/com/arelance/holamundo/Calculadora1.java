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
public class Calculadora1 {
    
        static double x=getNum("Introduce primer valor");
        static double y=getNum("Introduce segundo valor");
        static boolean mayor=comprobar (sumar(x,y));
        public static void main(String[] args){
            System.out.println("El resultado de sumar ambos es "+sumar(x,y));
            System.out.println("El resultado de restar ambos es "+restar(x,y));
            System.out.println("El resultado de multiplicar ambos es "+multiplicar(x,y));
            System.out.println("El resultado de dividir ambos es "+dividir(x,y));
            String msgM= mayor?"La suma es mayor de 100":"La suma es menor de 100";
            System.out.println(msgM);
            System.out.println("El nº mayor es "+Math.max(x, y));
        }
    public static double getNum(String msg){
        Scanner teclado = new Scanner (System.in);
        System.out.println(msg);
        return teclado.nextDouble();
    }
    public static double sumar(double x, double y){
        double suma=x+y;
        return suma;
    }
    public static double restar(double x, double y){
        double resta=x-y;
        return resta;
    }
    public static double multiplicar (double x, double y){
        double mult=x*y;
        return mult;
    }
    public static double dividir (double x, double y){
        double div=x/y;
        return div;
    }
    public static boolean comprobar(double suma){
        return suma>100;
    }
}