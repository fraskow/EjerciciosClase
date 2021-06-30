/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.lunesdivino.modelo.views;

import com.arelance.lunesdivino.modelo.Libreria;
import com.arelance.lunesdivino.modelo.Libro;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class RecogerDatosLibro implements View {

    Scanner teclado = new Scanner(System.in);

    @Override
    public Libro getData() {
        Libro libro;
        System.out.println("Dame el título");
        String titulo = teclado.next();
        System.out.println("Dame el ISBN");
        String ISBN = teclado.next();
        libro = new Libro(titulo, ISBN);
        return libro;

    }
    
    public int getIndex(){
        System.out.println("Dame el índice del libro");
        int index = teclado.nextInt();        
        return index;
   }

}
