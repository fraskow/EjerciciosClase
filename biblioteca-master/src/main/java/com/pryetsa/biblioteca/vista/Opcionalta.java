/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.biblioteca.vista;

import com.pryetsa.biblioteca.beans.Usuario;
import com.pryetsa.biblioteca.controlador.ControladorLogin;

/**
 *
 * @author pryet
 */
public class Opcionalta implements IAccion{

    private Usuario usuario;
    private ControladorLogin cl;
    public boolean alta(ControladorLogin cl){
        this.cl=cl;
        return true;
    }
    @Override
    public void ejecutar() {
        cl.altaUsuario(usuario);
    }
    
}
