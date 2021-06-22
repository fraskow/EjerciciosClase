/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.test;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Persona implements Cloneable {

    private String nombre;
    private StringBuilder apellido;
    private Integer edad;

    public Persona() {
    }

    public Persona(String nombre, StringBuilder apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public StringBuilder getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.apellido);
        hash = 41 * hash + Objects.hashCode(this.edad);
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
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return Objects.equals(this.edad, other.edad);
    }

    @Override
    public Persona clone() throws CloneNotSupportedException {
        Persona clonP1 = (Persona) super.clone();
        clonP1.apellido = new StringBuilder(this.apellido);
        return clonP1;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Persona p1 = new Persona();
        p1.apellido = new StringBuilder("Saavedra");
        Persona p2 = p1.clone();

        System.out.println(p1.equals(p2));

        p2.apellido.append("Galiano");

        System.out.println(p1.apellido.toString());
        System.out.println(p2.apellido.toString());

        // ya no son iguales
        System.out.println(p1.equals(p2));

    }

}
