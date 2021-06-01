/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestiondecontactos;
/**
 *
 * @author Admin
 */
public class Contactos {
    
    private int telefono;
    private String nombre;
    private String eMail;

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    public int getTelefono() {
        return telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public String geteMail() {
        return eMail;
    }
    public Contactos(int telefono, String nombre, String eMail) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Contactos{" + "telefono=" + telefono + ", nombre=" + nombre + ", eMail=" + eMail + '}';
    }
}
