package com.example.demofixed;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = {"/hello-servlet", "/add"})
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int x1=Integer.parseInt(request.getParameter("num1"));
        int x2=Integer.parseInt(request.getParameter("num2"));

        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + (x1+x2)+"</h1>");
        out.println("</body></html>");
    }


    public void destroy() {
    }
}