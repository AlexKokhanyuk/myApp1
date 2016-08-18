package com.kokhanyuk.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * by Alex on 5/18/2016.
 */
public class Controller extends HttpServlet {


    private static final long serialVersionUID = 1L;

    public Controller() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StringBuilder users = new StringBuilder("  Users");
      //  Statement stmt = null;


      //  Connection conn = (Connection) getServletContext().getAttribute("connection");
//        try {
//
//            conn.setAutoCommit(true);
//            stmt = conn.createStatement();
//            stmt.executeQuery("select * from user where username='Kolesnik'");
//            ResultSet rs = stmt.getResultSet();
//            while (rs.next()) {
//                users.append("Id " + rs.getInt("id") + " Name " + rs.getString("UserName") + " password " + rs.getString("password") + "\n");
//            }
//            users.append("One");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        PrintWriter out = response.getWriter();
        String s = "Hello" + users.toString();
        out.println("<h1> " + s + " </h1>");
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\">");
        out.println("<title>Title</title>");
        out.println("</head><body>");
        out.println("<h1> Hello, world!!! Word </h1>");
        out.println("</body></html>");


    }
}
