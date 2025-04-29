package com.cg.assignment.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/page4")
public class Servlet4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String city = request.getParameter("city");
        String country = request.getParameter("country");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("First Name: " + firstName);
        out.println("Last Name: " + lastName);
        out.println("Email: " + email);
        out.println("Phone: " + phone);
        out.println("City: " + city);
        out.println("Country: " + country);
    }
}
