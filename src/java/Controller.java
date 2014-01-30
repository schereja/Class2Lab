/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.WelcomeService;

/**
 *
 * @author schereja
 */
@WebServlet(urlPatterns = {"/greeter"}, name = "greeter")
public class Controller extends HttpServlet {
 private static final String RESULT_PAGE = "result.jsp";
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
        try (PrintWriter out = response.getWriter()) {
           
            String name = request.getParameter("name");
            
            WelcomeService ws = new WelcomeService(name);
            String welcomeMsg = ws.getWelcomeMsg();
            
            request.setAttribute("msg", welcomeMsg);
            RequestDispatcher view =
                request.getRequestDispatcher(RESULT_PAGE);
        view.forward(request, response);
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
//            //Gets the value from name in the form
//            String name = request.getParameter("name");
//            //Starts a new welcome Service
//            WelcomeService ws = new WelcomeService(name);
//            //Gets the welcome msg that was made
//            String welcomeMsg = ws.getWelcomeMsg();
//            //Creates the list that was needed
//            List newList = new ArrayList();
//            //Adds the welcome msg to the list
//            newList.add(welcomeMsg);
//            //Sends the list to the result page.
//            request.setAttribute("msg", newList);
//            RequestDispatcher view =
//                request.getRequestDispatcher(RESULT_PAGE);
//        view.forward(request, response);
//        processRequest(request, response);
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
