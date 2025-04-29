package com.cg.assignment.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/page3")
public class Servlet3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String city = request.getParameter("city");
        String country = request.getParameter("country");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        out.println("<html>");
        out.println("<body>");
        out.println("<p>First Name: " + firstName + "</p>");
        out.println("<p>Last Name: " + lastName + "</p>");

        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Phone: " + phone + "</p>");

        out.println("<p>City: " + city + "</p>");
        out.println("<p>Country: " + country + "</p>");

        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String city = request.getParameter("city");
        String country = request.getParameter("country");

        out.println("<html>");
        out.println("<body>");
        out.println("<p>First Name: " + (firstName != null ? firstName : "") + "</p>");
        out.println("<p>Last Name: " + (lastName != null ? lastName : "") + "</p>");
        out.println("<p>Email: " + (email != null ? email : "") + "</p>");
        out.println("<p>Phone: " + (phone != null ? phone : "") + "</p>");
        out.println("<p>City: " + (city != null ? city : "") + "</p>");
        out.println("<p>Country: " + (country != null ? country : "") + "</p>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}