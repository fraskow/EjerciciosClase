package com.arelance.crudjsp.test;


import java.util.HashSet;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Web application lifecycle listener.
 *
 * @author frans
 */
public class CreateUserList implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        se.getSession().setAttribute("listado", new HashSet<Usuario>());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }
}
