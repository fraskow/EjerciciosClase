/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.tiendaweb2.controller;

import com.arelance.tiendaweb2.beans.Articulo;
import com.arelance.tiendaweb2.beans.ArticuloCategorias;
import com.arelance.tiendaweb2.beans.LoginData;
import java.io.IOException;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author frans
 */
@WebServlet(name = "TiendaServlet", urlPatterns = {"/TiendaServlet"})
public class TiendaServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        LoginData currentUser = (LoginData) request.getSession().getAttribute("currentUser");
        Map<LoginData, Articulo> compras = (Map<LoginData, Articulo>) request.getSession().getAttribute("compras");

        String[] articulos = request.getParameterValues("articulos");

        for (String articulo : articulos) {
            if (articulo.equals("pelota")) {
                Articulo pelota = new Articulo(ArticuloCategorias.DEPORTE, "pelota", "breve descripcion de pelota");
                compras.put(currentUser, pelota);
            } else if (articulo.equals("botas")) {
                Articulo botas = new Articulo(ArticuloCategorias.DEPORTE, "botas", "breve descripcion de botas");
                compras.put(currentUser, botas);
            }else if (articulo.equals("mesita")) {
                Articulo mesita = new Articulo(ArticuloCategorias.HOGAR, "botas", "breve descripcion de mesita");
                compras.put(currentUser, mesita);
            }else if (articulo.equals("lampara")) {
                Articulo lampara = new Articulo(ArticuloCategorias.HOGAR, "botas", "breve descripcion de lampara");
                compras.put(currentUser, lampara);
            }else if (articulo.equals("camiseta")) {
                Articulo camiseta = new Articulo(ArticuloCategorias.TEXTIL, "botas", "breve descripcion de camiseta");
                compras.put(currentUser, camiseta);
            }else if (articulo.equals("vestido")) {
                Articulo vestido = new Articulo(ArticuloCategorias.TEXTIL, "vestido", "breve descripcion de vestido");
                compras.put(currentUser, vestido);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
