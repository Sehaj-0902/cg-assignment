package com.cg.assignment.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/page2")
public class Servlet2 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String firstName = (String) session.getAttribute("firstName");
        String lastName = (String) session.getAttribute("lastName");

        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("First Name: " + firstName + "<br><br>");
        response.getWriter().println("Last Name: " + lastName + "<br><br>");
        response.getWriter().println("<form action='/page2' method='post'>");
        response.getWriter().println("Email: <input type='email' name='email'><br><br>");
        response.getWriter().println("Phone Number: <input type='text' name='phone'><br><br>");
        response.getWriter().println("<input type='submit' value='Submit'>");
        response.getWriter().println("</form>");
        response.getWriter().println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        HttpSession session = request.getSession();
        session.setAttribute("email", email);
        session.setAttribute("phone", phone);

        response.sendRedirect("/page3");
    }
}