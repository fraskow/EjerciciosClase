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
import java.util.Set;
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

        Set<Articulo> compra = (Set<Articulo>) request.getSession().getAttribute("compra");
        String[] articulos = request.getParameterValues("articulos");

        for (String articulo : articulos) {
            switch (articulo) {
                case "pelota":
                    compra.add(new Articulo(ArticuloCategorias.DEPORTE, articulo, "Descripcion de " + articulo));
                case "botas":
                    compra.add(new Articulo(ArticuloCategorias.DEPORTE, articulo, "Descripcion de " + articulo));
                case "mesita":
                    compra.add(new Articulo(ArticuloCategorias.DEPORTE, articulo, "Descripcion de " + articulo));
                case "lampara":
                    compra.add(new Articulo(ArticuloCategorias.DEPORTE, articulo, "Descripcion de " + articulo));
                case "camiseta":
                    compra.add(new Articulo(ArticuloCategorias.DEPORTE, articulo, "Descripcion de " + articulo));
                case "vestido":
                    compra.add(new Articulo(ArticuloCategorias.DEPORTE, articulo, "Descripcion de " + articulo));
            }
        }

        request.getRequestDispatcher("./listaArticulo.jsp").forward(request, response);
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
