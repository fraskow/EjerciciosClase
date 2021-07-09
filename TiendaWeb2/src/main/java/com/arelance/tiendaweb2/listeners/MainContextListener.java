/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.tiendaweb2.listeners;

import com.arelance.tiendaweb2.beans.DatosPersonales;
import com.arelance.tiendaweb2.beans.Direccion;
import com.arelance.tiendaweb2.beans.LoginData;
import com.arelance.tiendaweb2.beans.Nick;
import com.arelance.tiendaweb2.beans.Password;
import com.arelance.tiendaweb2.beans.Usuario;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author Admin
 */
public class MainContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
       
       Nick juanNick = new Nick("juanito");
       Password juanPw = new Password("1234");
       LoginData juanLog = new LoginData(new HashMap<Nick,Password>());
       Usuario juan = new Usuario(new DatosPersonales("juan", "belmonte", "15"), new Direccion("42150", "2", "JuanMontana"));
       Map<LoginData,Usuario> userMaped = new HashMap<>();
       
       userMaped.put(juanLog, juan);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
