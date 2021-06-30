/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.lunesdivino.services;

import com.arelance.lunesdivino.modelo.Libreria;
import com.arelance.lunesdivino.modelo.Libro;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class CRUDRepository {

    private final Libreria libreria = new Libreria(new ArrayList<>());

    public boolean add(Libro libro) {
        boolean retValue = false;
        if (libro != null && libreria.getLibros().size() < 5) {
            retValue = libreria.add(libro);
        }
        return retValue;
    }
    
    public boolean remove(Libro libro){
        boolean retValue = false;
        if(libro != null && libreria.getLibros().contains(libro)){
            retValue=libreria.remove(libro);
        }
        return retValue;
    }

}
