/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.tiendaweb2.listeners;

import com.arelance.tiendaweb2.beans.Articulo;
import com.arelance.tiendaweb2.beans.LoginData;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
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
        
        Set<Articulo> compra = new HashSet<>();
        se.getSession().setAttribute("compra", compra);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }
}
