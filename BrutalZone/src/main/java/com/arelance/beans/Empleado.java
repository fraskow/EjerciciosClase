/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.beans;

/**
 *
 * @author Admin
 */
public class Empleado extends Persona {
    public static void main(String[] args) {
        Empleado x = new Empleado();
        Persona y = new Empleado();
        Persona z = new Persona();
        System.out.println(x instanceof Persona);
        System.out.println(y instanceof Empleado);
        System.out.println(z.getClass()==y.getClass());
    }
}
