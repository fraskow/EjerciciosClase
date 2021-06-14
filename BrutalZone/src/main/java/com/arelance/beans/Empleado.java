/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.beans;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Empleado extends Persona {

    public int salario;

    public Empleado(String nombre, int salario) {
        super(nombre);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public static void main(String[] args) {
        Empleado x = new Empleado("Pepe", 55);
        Empleado y = new Empleado("Pepe", 22);
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(x);
        empleados.add(y);
        System.out.println(empleados.toString());
        //Persona z = new Persona();
        //System.out.println(x instanceof Persona);
        //System.out.println(y instanceof Empleado);
        //System.out.println(z.getClass()==y.getClass());
        //System.out.println(Collections.sort());
    }

}
