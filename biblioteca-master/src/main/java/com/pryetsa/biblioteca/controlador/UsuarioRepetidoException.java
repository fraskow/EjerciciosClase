/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.biblioteca.controlador;

/**
 *
 * @author pryet
 */
public class UsuarioRepetidoException extends Exception {

    public UsuarioRepetidoException() {
        super("El usuario existe");
    }
    
}
