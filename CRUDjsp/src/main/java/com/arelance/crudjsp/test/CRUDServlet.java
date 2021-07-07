package com.arelance.crudjsp.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author frans
 */
public class CRUDServlet extends HttpServlet {

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

        String name = request.getParameter("name");
        String apellidos = request.getParameter("apellidos");
        Integer edad = Integer.parseInt(request.getParameter("edad"));
        String boton = request.getParameter("boton");
        Usuario currentUser = UsuarioHelper.currentUser(new Usuario(name,apellidos,edad));
        
        
        if (boton.equals("save")) {
            AccionAlta alta = new AccionAlta();
            alta.exectute(currentUser);
            response.sendRedirect("./Listado.jsp");
        } else if (boton.equals("delete")) {
            AccionBaja baja = new AccionBaja();
            baja.exectute(currentUser);
            response.sendRedirect("./Listado.jsp");
        }
    }
//    protected RequestDispatcher processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        String name = request.getParameter("name");
//        String apellidos = request.getParameter("apellidos");
//        Integer edad = Integer.parseInt(request.getParameter("edad"));
//        String boton = request.getParameter("boton");
//        RequestDispatcher dispatcherDefault = request.getServletContext().getRequestDispatcher("/Listado.jsp");
////        Set<Usuario> usuarios = (Set<Usuario>) request.getSession().getAttribute("listado");
//        if (boton.equals("save")) {
//            AccionAlta alta = new AccionAlta();
//            alta.exectute(new Usuario(name, apellidos, edad));
//            RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/Listado.jsp");
//            return dispatcher;
////            usuarios.add(new Usuario(name, apellidos, edad));
////            request.getServletContext().getRequestDispatcher("/Listado.jsp").forward(request, response);
////            response.sendRedirect("./Listado.jsp");
//        } else if (boton.equals("delete")) {
//            AccionBaja baja = new AccionBaja();
//            baja.exectute(new Usuario(name, apellidos, edad));
//            RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/Listado.jsp");
//            return dispatcher;
//            //request.getServletContext().getRequestDispatcher("/Listado.jsp").forward(request, response);
////            response.sendRedirect("./Listado.jsp");
//        }
//        return dispatcherDefault;
//    }

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
