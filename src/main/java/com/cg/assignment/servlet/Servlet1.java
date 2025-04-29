package com.cg.assignment.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/page1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        out.println("<html>");
        out.println("<body>");
        out.println("<p>First Name: " + firstName + "</p>");
        out.println("<p>Last Name: " + lastName + "</p>");

        out.println("<form action='page2' method='post'>");
        out.println("Email: <input type='text' name='email'/><br/><br/>");
        out.println("Phone: <input type='text' name='phone'/><br/><br/>");

        out.println("<input type='hidden' name='firstName' value='" + firstName + "'/");
        out.println("<input type='hidden' name='lastName' value='" + lastName + "'/");

        out.println("<button><input type='submit' value='Submit'/>Submit</button>");
        out.println("</form");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<form action='page2' method='post'>");
        out.println("First Name: <input type='text' name='firstName' /><br /><br />");
        out.println("Last Name: <input type='text' name='lastName' /><br /><br />");
        out.println("<button><input type='submit' value='Submit/>Submit</button>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}