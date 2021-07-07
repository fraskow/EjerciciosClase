/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.crudbasic.main;

import java.util.HashSet;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author Admin
 */
public class CreaLista implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        se.getSession().setAttribute("listado", new HashSet<Usuario>());
        //se.getSession().setAttribute("currentUser", new Usuario());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }
}
