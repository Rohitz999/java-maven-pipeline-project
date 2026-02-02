package com.example;

import java.io.IOException;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        response.getWriter().println(
            "<html>" +
            "<head><title>Hello Servlet</title></head>" +
            "<body>" +
            "<h1>Hello from Jenkins Build 🚀</h1>" +
            "<p>Application deployed successfully.</p>" +
            "<p>Build time: " + LocalDateTime.now() + "</p>" +
            "</body>" +
            "</html>"
        );
    }
}

