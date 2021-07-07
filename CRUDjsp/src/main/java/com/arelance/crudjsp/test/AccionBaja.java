/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.crudjsp.test;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class AccionBaja implements Accion{
    
    Set<Usuario> usuarios = new HashSet<>();
    
    @Override
    public void exectute(Usuario usuario) {
        usuarios.remove(usuario);
    }
    
}
