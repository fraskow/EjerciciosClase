/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coche.propietario;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Propietario implements Cloneable{
    
    private StringBuilder nombre;
    private StringBuilder apellido;
    private final Integer edad;

    public Propietario(StringBuilder nombre, StringBuilder apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public StringBuilder getNombre() {
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
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + Objects.hashCode(this.apellido);
        hash = 37 * hash + Objects.hashCode(this.edad);
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
        final Propietario other = (Propietario) obj;
        if (!Objects.equals(this.nombre.toString(), other.nombre.toString())) {
            return false;
        }
        if (!Objects.equals(this.apellido.toString(), other.apellido.toString())) {
            return false;
        }
        return Objects.equals(this.edad, other.edad);
    }
    
    @Override
    public Propietario clone() throws CloneNotSupportedException{
        Propietario propClon = (Propietario) super.clone();
        propClon.nombre = new StringBuilder(this.nombre);
        propClon.apellido = new StringBuilder(this.apellido);
        return propClon;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
}
