/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.beans;

import java.util.ArrayList;
import java.util.Collections;

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
        Empleado x = new Empleado("Juan", 10);
        Empleado y = new Empleado("Ana", 55);
        Empleado z = new Empleado("Ana", 13);
        Empleado k = new Empleado("Juan", 22);
        ArrayList<Empleado> empleados = new ArrayList<>();
        // si la colección fuese de Persona habría que hacer cast
        // o habría que hacer un if con auxiliar.
        empleados.add(x);
        empleados.add(y);
        empleados.add(z);
        empleados.add(k);
        System.out.println(empleados);
        System.out.println(x.compareTo(k)); //comparacion por nombre que dará -1 
        //porque tienen mismo nombre pero el salario comparado  -----> con equals daría false
        //es menor que el siguiente
        System.out.println(x.equals(k));
        System.out.println(x.compareTo(z)); //otra comparacion por nombre
        System.out.println(y.compareTo(z)); // esta comparacion dará 1 porque el 
        //nombre es el mismo pero no el salario -----> con equals daría false
        System.out.println(y.equals(z));
        Collections.sort(empleados); // ordenar por nombre(persona) y salario(empleado)
        System.out.println("Ordenados por nombre y salario " + empleados);
        empleados.forEach( t -> {
            System.out.println(t.nombre+" "+t.salario);   //muestra nombre(persona) de empleados
        });
        System.out.println("Está en la posición "+Collections.binarySearch(empleados, k)); //devuleve la posicion del arraylist 
        //en donde se encuentra

        //instaceof -> palabra reservada que devuelve booleano de si son iguales los objetos
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + super.getNombre() + " salario=" + salario + '}';
    }

    @Override
    public int compareTo(Persona e) {
        int resultado;
        resultado = super.compareTo(e);
        if (resultado == 0) {
            Empleado t = (Empleado) e;
            return Integer.compare(this.salario, t.salario);
        }
        return resultado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.salario;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        return this.salario == other.salario;
    }

}
