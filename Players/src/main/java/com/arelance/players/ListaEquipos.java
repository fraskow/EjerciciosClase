/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.players;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ListaEquipos {
    public static void main(String[] args) {
        String [] equipos = new String[6];
        for(int i=0; i<equipos.length; i++){
            equipos[i]=Jugadores.getTeam("Equipo "+(i+1));
            List teams = Arrays.asList(equipos);
            System.out.println(teams);
        }
    }
}
