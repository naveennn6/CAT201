package com.example.servlet;

import com.example.model.ContactForm;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/contact")
public class ContactFormServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get data from the request
        String name = request.getParameter("Name");
        String email = request.getParameter("Email");
        String message = request.getParameter("Password"); // You might want to rename this parameter

        // Create a ContactForm object
        ContactForm contactForm = new ContactForm();
        contactForm.setName(name);
        contactForm.setEmail(email);
        contactForm.setMessage(message);

        // Here you can add logic to save the contactForm data to a database or send an email

        // Respond back to the frontend
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println("{\"status\": \"success\", \"message\": \"Message sent successfully!\"}");
        out.flush();
    }
}
