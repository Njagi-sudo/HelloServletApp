package com.example.hello;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

//A basic servlet that handles HTTP request and displays a message

public class HelloServlet extends HttpServlet {
//    @param request TheHttpServlet Request object that contains the request the client made
//    @params response the HttpServletResponse object used to send a response back to the client
//    @params IOException if an input or output error occurs while handling the request
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
//        set the content type of the response to HTML
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello World!</h1>");
    }
}

