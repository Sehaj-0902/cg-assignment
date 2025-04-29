package com.cg.assignment.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/page3")
public class Servlet3 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String firstName = (String) session.getAttribute("firstName");
        String lastName = (String) session.getAttribute("lastName");
        String email = (String) session.getAttribute("email");
        String phone = (String) session.getAttribute("phone");

        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("First Name: " + firstName + "<br><br>");
        response.getWriter().println("Last Name: " + lastName + "<br><br>");
        response.getWriter().println("Email: " + email + "<br><br>");
        response.getWriter().println("Phone: " + phone + "<br><br>");
        response.getWriter().println("<form action='/page3' method='post'>");
        response.getWriter().println("City: <input type='text' name='city'><br><br>");
        response.getWriter().println("Country: <input type='text' name='country'><br><br>");
        response.getWriter().println("<input type='submit' value='Submit'>");
        response.getWriter().println("</form>");
        response.getWriter().println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String city = request.getParameter("city");
        String country = request.getParameter("country");

        HttpSession session = request.getSession();
        session.setAttribute("city", city);
        session.setAttribute("country", country);

        response.sendRedirect("/page4");
    }
}