/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.calculadoraconcatena.listeners;

import java.util.ArrayList;
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
        se.getSession().setAttribute("resultados", new ArrayList<Integer>());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }
}
