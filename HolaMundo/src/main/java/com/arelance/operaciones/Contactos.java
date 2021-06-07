/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.operaciones;

/**
 *
 * @author Admin
 */ 
public class Contactos {

    private String telefono;
    private String nombre;
    private String eMail;

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String geteMail() {
        return eMail;
    }

    public Contactos(String telefono, String nombre, String eMail) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Contacto{" + "telefono=" + telefono + ", nombre=" + nombre + ", eMail=" + eMail + '}';
    }
}
