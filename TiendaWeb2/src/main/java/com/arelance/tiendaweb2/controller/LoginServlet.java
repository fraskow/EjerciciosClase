/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.tiendaweb2.controller;

import com.arelance.tiendaweb2.beans.LoginData;
import com.arelance.tiendaweb2.beans.Usuario;
import java.io.IOException;
import java.util.Map;
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
        
        Map<LoginData, Usuario> userMapped = (Map<LoginData, Usuario>) request.getServletContext().getAttribute("users");
        String boton = request.getParameter("boton");
        String nick = request.getParameter("nick");
        String pw = request.getParameter("pw");
        LoginData currentUser = new LoginData(nick, pw);
       
        String pwConfirmed = request.getParameter("pwConfirmed");
        int contador = 0;
        request.getSession().setAttribute("contador", contador);
        

        if (boton.equals("login")) {
            if (pwConfirmed.equals(pw)) {
                if (userMapped.keySet().contains(currentUser)){
                        request.getSession(true);
                        request.getSession().setAttribute("currentUser", currentUser);
                        request.getRequestDispatcher("./tienda.jsp").forward(request, response);
                    
                } else {
                    contador++;
                    request.getSession(false);
                    if (contador > 3) {
                        request.getRequestDispatcher("./index.jsp").forward(request, response);
                    } else if (contador <= 3) {
                        request.getRequestDispatcher("./errorLogin.jsp").forward(request, response);
                    }
                }
            } else {
                request.getRequestDispatcher("./errorLogin.jsp").forward(request, response);
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
