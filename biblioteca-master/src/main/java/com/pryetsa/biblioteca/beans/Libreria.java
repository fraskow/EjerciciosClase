/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.biblioteca.beans;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author pryet
 */
public class Libreria {

    private final Set<Libro> libros;
    private final Set<Usuario> usuarios;
    private static Libreria libreria;

    private Libreria() {
        this.libros = new HashSet<>();
        this.usuarios = new TreeSet<>();
    }

    public static Libreria getInstance() {
        if (libreria == null) {
            libreria = new Libreria();
        }
        return libreria;
    }

    public Set<Libro> getLibros() {
        return libros;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

}
