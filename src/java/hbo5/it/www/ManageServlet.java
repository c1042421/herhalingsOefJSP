/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbo5.it.www;

import hbo5.it.www.beans.Bestelling;
import hbo5.it.www.beans.Broek;
import hbo5.it.www.beans.SoortBroek;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author c1042421
 */
@WebServlet(name = "ManageServlet", urlPatterns = {"/ManageServlet"})
public class ManageServlet extends HttpServlet {

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
        HttpSession session = request.getSession();

        String naam = request.getParameter("naam");
        int aantal = Integer.parseInt(request.getParameter("aantal"));
        LocalDate datum = LocalDate.parse(request.getParameter("datum"));
        SoortBroek soort = SoortBroek.valueOf(request.getParameter("soort"));

        Broek broek = new Broek(80, 40, "g-star");
        broek.setPrijs(99.95);
        broek.setType(soort);

        Bestelling bestelling = new Bestelling();
        bestelling.setDatumBestelling(datum);
        bestelling.setAantalStuks(aantal);
        bestelling.setNaamKoper(naam);
        bestelling.setBroek(broek);

        ArrayList<Bestelling> bestellingen = (ArrayList<Bestelling>) session.getAttribute("bestellingen");

        if (bestellingen == null) {
            bestellingen = new ArrayList<>();
        }
        
        bestellingen.add(bestelling);

        session.setAttribute("bestellingen", bestellingen);

        request.getRequestDispatcher("bestelling.jsp").forward(request, response);
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
