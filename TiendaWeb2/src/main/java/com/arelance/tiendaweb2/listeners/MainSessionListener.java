/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.tiendaweb2.listeners;

import com.arelance.tiendaweb2.beans.Articulo;
import com.arelance.tiendaweb2.beans.ArticuloCategorias;
import com.arelance.tiendaweb2.beans.LoginData;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author frans
 */
public class MainSessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        Map<LoginData,Articulo> compras = new HashMap<>();
        LoginData currentUser = (LoginData) se.getSession().getAttribute("currentUser");
        Articulo articuloComprado = new Articulo(ArticuloCategorias.DEPORTE, "tenis", "breve descripcion de tenis");
        
        compras.put(currentUser, articuloComprado);
        
        se.getSession().setAttribute("compras", compras);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }
}
