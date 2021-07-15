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
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author Admin
 */
public class MainSessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        
        Oferta o1 = new Oferta(EnumLocation.LOCAL, EnumExp.JUNIOR, "1000", "Breve descripcion 1");
        Oferta o2 = new Oferta(EnumLocation.NACIONAL, EnumExp.SENIOR, "2000", "Breve descripcion 2");
        Oferta o3 = new Oferta(EnumLocation.INTERNACIONAL, EnumExp.SENIOR, "3000", "Breve descripcion 3");
        List<Oferta> ofertas = new ArrayList<>();
        ofertas.add(o1);
        ofertas.add(o2);
        ofertas.add(o3);
        
        se.getSession().setAttribute("ofertas", ofertas);
        
        Map<Oferta,Usuario> inscritos = new HashMap<>();
        inscritos.put(o1, null);
        inscritos.put(o2, null);
        inscritos.put(o3, null);
        
        se.getSession().setAttribute("inscritos", inscritos);
        
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }
}
