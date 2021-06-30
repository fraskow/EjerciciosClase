/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.lunesdivino.modelo;

import com.arelance.lunesdivino.modelo.views.RecogerDatosLibro;
import com.arelance.lunesdivino.modelo.views.View;
import com.arelance.lunesdivino.services.CRUDRepository;

/**
 *
 * @author Admin
 */
public class Controller {

    private CRUDRepository crud = new CRUDRepository();
    private View view;

    public boolean altaLibro() {
        view = new RecogerDatosLibro();
        Libro libro = view.getData();
        return crud.add(libro);

    }
    
    public boolean bajaLibro(){
        view = new RecogerDatosLibro();
        Libro libro = view.getData();
        return crud.remove(libro);
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.altaLibro();
        System.out.println();
    }
}
