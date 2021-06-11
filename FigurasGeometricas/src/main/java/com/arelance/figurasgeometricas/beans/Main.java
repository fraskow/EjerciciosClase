/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.figurasgeometricas.beans;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Figura x = new Circulo(2);
        Figura y = new Triangulo(4, 2);
        mostrarArea(x);
        mostrarArea(y);
    }

    public static void mostrarArea(Figura figura) {
        System.out.println("El area de la figura es " + figura.area());
    }

}
