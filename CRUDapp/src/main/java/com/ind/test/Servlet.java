package com.ind.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/servlet")
public class Servlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = "springstudent";
        String pass = "springstudent";
        String url = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
        String driver = "com.mysql.jdbc.Driver";

        try {
            PrintWriter out = response.getWriter();
            out.println("connecting");
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, user, pass);
            out.println("success");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }

    }
}
