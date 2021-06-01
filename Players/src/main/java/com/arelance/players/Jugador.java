/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.players;

/**
 *
 * @author Admin
 */
public class Jugador {

    public String nombre;
    public int dorsal;

    Jugador(String nombre, int dorsal){
        this.nombre=nombre;
        this.dorsal=dorsal;
    }
    public String getNombre(){
        return nombre;
    }
    public int getDor(){
        return dorsal;
    }
    public int setDor(int jdorsal){
        return dorsal=jdorsal;
    }
}
