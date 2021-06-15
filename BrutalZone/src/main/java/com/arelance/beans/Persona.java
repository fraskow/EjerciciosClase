/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.beans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Persona implements Comparable<Persona> {

    public final String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static Persona persona1 = new Persona("Pepe");
    public static Persona persona2 = new Persona("Antonio");

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }

    @Override
    public int compareTo(Persona o) {
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nombre);
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
        final Persona other = (Persona) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    
    
    public static void main(String[] args) {
        System.out.println(persona1.nombre.compareTo(persona2.nombre));
        System.out.println(persona2.nombre.compareTo(persona1.nombre));
        System.out.println(persona1.nombre.compareTo(persona1.nombre));
        System.out.println(persona2.nombre.compareTo(persona2.nombre));
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(new Persona("Ana"));
        listaPersonas.add(new Persona("Tete"));
        Collections.sort(listaPersonas);
        System.out.println("Ordenados " + listaPersonas);
        System.out.println(Collections.binarySearch(listaPersonas, new Persona("Ana")));
        listaPersonas.forEach((Persona t) -> {
            // clase anonima interna
            System.out.println(t.nombre);   // clase anonima convertida en lambda
        });
       //  System.out.println(Collections.sort(listaPersonas,Collections.reverseOrder()));
       // investigar sobre Collections.reverseOrder.
    }
}
