/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.megajobs.listeners;

import com.arelance.megajobs.beans.EnumExp;
import com.arelance.megajobs.beans.EnumLocation;
import com.arelance.megajobs.beans.Oferta;
import com.arelance.megajobs.beans.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
        
        Usuario u1 = new Usuario("user1", "user1");
        Usuario u2 = new Usuario("user2", "user2");
        Usuario u3 = new Usuario("user3", "user3");
        Usuario u4 = new Usuario("user4", "user4");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        
        sce.getServletContext().setAttribute("usuarios", usuarios);
        
        Oferta o1 = new Oferta(EnumLocation.LOCAL, EnumExp.JUNIOR, "1000", "Breve descripcion 1");
        Oferta o2 = new Oferta(EnumLocation.NACIONAL, EnumExp.SENIOR, "2000", "Breve descripcion 2");
        Oferta o3 = new Oferta(EnumLocation.INTERNACIONAL, EnumExp.SENIOR, "3000", "Breve descripcion 3");
        List<Oferta> ofertas = new ArrayList<>();
        ofertas.add(o1);
        ofertas.add(o2);
        ofertas.add(o3);
        
        sce.getServletContext().setAttribute("ofertas", ofertas);
        
        Map<Oferta,Set<Usuario>> inscritos = new HashMap<>();
        inscritos.put(o1, new HashSet<>());
        inscritos.put(o2, new HashSet<>());
        inscritos.put(o3, new HashSet<>());
        
        sce.getServletContext().setAttribute("inscritos", inscritos);
        
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
