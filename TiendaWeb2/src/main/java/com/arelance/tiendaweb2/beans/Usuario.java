/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.tiendaweb2.beans;

/**
 *
 * @author Admin
 */
public final class Usuario {
    
    public DatosPersonales dp;
    public Direccion direccion;

    public Usuario() {
    }
    
    public Usuario(DatosPersonales dp, Direccion direccion) {
        this.dp = dp;
        this.direccion = direccion;
    }

    public DatosPersonales getDp() {
        return dp;
    }

    public Direccion getDireccion() {
        return direccion;
    }
       
}
