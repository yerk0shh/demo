package com.example.demo;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private String messageTwo;

    public void init() {
        message = "MUIT Sharaga, Narxoz>>>MIT";
        messageTwo = "p.s. Kurmangazy Agay";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h2>" + messageTwo + "</h2>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}