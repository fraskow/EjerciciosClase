/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.megajobs.controller;

import com.arelance.megajobs.beans.Usuario;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

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
        
        String nick = request.getParameter("nick");
        String password = request.getParameter("password");
        List<Usuario> usuarios = (List<Usuario>) request.getServletContext().getAttribute("usuarios");
        Usuario currentUser = new Usuario(nick, password);
        
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario aux = usuarios.get(i);
            if (aux.compare(aux, currentUser) == 0) {
                if (aux.getPw().equals(password)) {
                    request.getSession(true);
                    request.getSession().setAttribute("currentUser", currentUser);
                    request.getRequestDispatcher("./index.jsp").forward(request, response);
                    return;
                }
                request.setAttribute("errorPass", "Contraseña incorrecta");
                request.getRequestDispatcher("./login.jsp").forward(request, response);
            }
            request.setAttribute("errorNick", "El nick es incorrecto");
            
        }
        request.getRequestDispatcher("./login.jsp").forward(request, response);
        
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
