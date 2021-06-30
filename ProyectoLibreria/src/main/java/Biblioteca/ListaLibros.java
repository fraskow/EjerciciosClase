/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ListaLibros {
    
    private final List<Libro> libros;
    

    public ListaLibros() {
        libros = new ArrayList<>();
    }

    public ListaLibros(List<Libro> libros) {
        this.libros = libros;

    }

    public boolean add(Libro libro) {
        return libros.add(libro);
    }
    public boolean remove(Libro libro){
        return libros.remove(libro);
    }
    
    public List<Libro> getLibros() {
        List<Libro> libros = new ArrayList<>(this.libros);
        return libros;
    }
}
