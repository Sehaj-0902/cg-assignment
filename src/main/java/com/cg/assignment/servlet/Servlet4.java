package com.cg.assignment.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/page4")
public class Servlet4 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String firstName = (String) session.getAttribute("firstName");
        String lastName = (String) session.getAttribute("lastName");
        String email = (String) session.getAttribute("email");
        String phone = (String) session.getAttribute("phone");
        String city = (String) session.getAttribute("city");
        String country = (String) session.getAttribute("country");

        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("First Name: " + firstName + "<br><br>");
        response.getWriter().println("Last Name: " + lastName + "<br><br>");
        response.getWriter().println("Email: " + email + "<br><br>");
        response.getWriter().println("Phone: " + phone + "<br><br>");
        response.getWriter().println("City: " + city + "<br><br>");
        response.getWriter().println("Country: " + country + "<br><br>");
        response.getWriter().println("</body></html>");
    }
}