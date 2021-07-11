/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.tiendaweb2.listeners;

import com.arelance.tiendaweb2.beans.DatosPersonales;
import com.arelance.tiendaweb2.beans.Direccion;
import com.arelance.tiendaweb2.beans.LoginData;
import com.arelance.tiendaweb2.beans.Usuario;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author frans
 */
public class MainContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Map<LoginData, Usuario> userMapped = new HashMap<>();

        userMapped.put(new LoginData("juan", "1234"), new Usuario(new DatosPersonales("juan", "belmonte", "15"), new Direccion("42150", "2", "JuanMontana")));
        userMapped.put(new LoginData("pepe", "4321"), new Usuario(new DatosPersonales("Pepe", "Botella", "14"), new Direccion("21403", "3", "Pepecalle")));
        userMapped.put(new LoginData("tomas", "9999"), new Usuario(new DatosPersonales("Tomas", "Timon", "23"), new Direccion("12345", "5", "tomascalle")));

        sce.getServletContext().setAttribute("users", userMapped);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
