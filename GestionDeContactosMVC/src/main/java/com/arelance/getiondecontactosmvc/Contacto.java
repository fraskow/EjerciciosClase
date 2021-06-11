/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.getiondecontactosmvc;

/**
 *
 * @author Admin
 */
public class Contacto {
    private String telefono;
    private String nombre;
    private String email;

    public Contacto(String telefono, String nombre, String email) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
