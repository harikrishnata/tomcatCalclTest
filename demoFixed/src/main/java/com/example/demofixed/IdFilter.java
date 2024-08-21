package com.example.demofixed;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@WebFilter(filterName = "IdFilterFilter", urlPatterns = {"/add"})
public class IdFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization code
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // Pre-processing
        // Example: Logging the request
        System.out.println("Request received at " + request.getRemoteAddr());

        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        int x1, x2;

        try {
            x1 = Integer.parseInt(num1);
            x2 = Integer.parseInt(num2);
        } catch (NumberFormatException e) {
            // If either num1 or num2 is not an integer, send an error response
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>Error: Both num1 and num2 must be integers.</h1>");
            out.println("</body></html>");
            return;
        }

        // Continue the request if x1 and x2 are valid integers
        chain.doFilter(request, response);

        // Post-processing
        // Example: Logging the response
        System.out.println("Response sent to " + request.getRemoteAddr());
    }


    public void destroy() {
        // Cleanup code
    }
}
