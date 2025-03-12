package edu.bdeb.projet_evgenii_morgunov;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // redirect to vue.jsp
        response.sendRedirect("vue.jsp");
    }

    public void destroy() {
    }
}