/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.tiendaweb2.controller;

import com.arelance.tiendaweb2.beans.DatosPersonales;
import com.arelance.tiendaweb2.beans.Direccion;
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
@WebServlet(name = "RegistroServlet", urlPatterns = {"/RegistroServlet"})
public class RegistroServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        
        String nick = request.getParameter("nick");
        String pw = request.getParameter("pwRegistro");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String edad = request.getParameter("edad");
        String cp = request.getParameter("cp");
        String calle = request.getParameter("calle");
        String num = request.getParameter("num");
        
        Map<LoginData, Usuario> userMapped = (Map<LoginData, Usuario>) request.getServletContext().getAttribute("users");
        LoginData newLog = new LoginData(nick, pw);
        Usuario newUser = new Usuario(new DatosPersonales(nombre, apellido, edad), new Direccion(cp, num, calle));
        
        //userMapped.put(newLog, newUser);
        
        if(userMapped.containsKey(newLog)){
            request.getRequestDispatcher("./errorRegistro.jsp").forward(request, response);
        } else{
            userMapped.put(newLog, newUser);
            request.getRequestDispatcher("./login.jsp").forward(request, response);
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
