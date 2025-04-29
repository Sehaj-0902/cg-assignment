package com.cg.assignment.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/page2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
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

        out.println("<form action='page3' method='post'>");
        out.println("City: <input type='text' name='city'/><br/><br/>");
        out.println("Country: <input type='text' name='country'/><br/><br/>");

        out.println("<input type='hidden' name='firstName' value='" + firstName + "'/");
        out.println("<input type='hidden' name='lastName' value='" + lastName + "'/");

        out.println("<input type='hidden' name='email' value='" + email + "'/");
        out.println("<input type='hidden' name='phone' value='" + phone + "'/");

        out.println("<button><input type='submit' value='Submit'/></button>");
        out.println("</form");
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

        out.println("<html>");
        out.println("<body>");
        out.println("<p>First Name: " + (firstName != null ? firstName : "") + "</p>");
        out.println("<p>Last Name: " + (lastName != null ? lastName: "") + "</p>");
        out.println("<form action='page2' method='post'>");
        out.println("Email: <input type='text' name='email' /><br /><br />");
        out.println("Phone: <input type='text' name='phone' /><br /><br />");
        out.println("<input type='hidden' name='firstName' value='" + (firstName != null ? firstName : "") + "' />");
        out.println("<input type='hidden' name='lastName' value='" + (lastName != null ? lastName : "") + "' />");
        out.println("<button><input type='submit' value='Submit/></button>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}