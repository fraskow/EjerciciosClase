/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestiondecontactos2;

/**
 *
 * @author Admin
 */
public class Contacto {
    
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

    public Contacto(String nombre, String telefono, String eMail) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.eMail = eMail;
    } 

    @Override
    public String toString() {
        return "En agenda: " + "Nombre: " + nombre + ", Telefono: " + telefono + ", Email: " + eMail;
    }
}
