/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.calcuwebmap.test;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author Admin
 */
public class NewServletListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        Map<String,Operacion> operaciones = new HashMap<>();
        
        operaciones.put("suma", new OpSuma());
        operaciones.put("resta", new OpResta());
        operaciones.put("mult", new OpMult());
        operaciones.put("div", new OpDiv());
        
        se.getSession().setAttribute("operaciones", operaciones);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }
}
