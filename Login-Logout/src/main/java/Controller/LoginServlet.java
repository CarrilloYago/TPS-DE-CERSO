/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import Bean.Loginbean;
import DAO.LoginDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author yagoc
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Loginbean loginbean = new Loginbean();
        loginbean.setUsername(username);
        loginbean.setPassword(password);
        LoginDAO loginDao = new LoginDAO();
        String userRole = loginDao.authenticateUser(loginbean);
        
        if (userRole != null) {
            switch (userRole) {
                case "admin":
                    System.out.println("role admin");
                    HttpSession session = request.getSession();
                    session.setAttribute("admin", username);
                    request.setAttribute("username", username);
                    request.getRequestDispatcher("Admin.jsp").forward(request, response);
                    break;
                case "editor":
                    response.sendRedirect("Editor.jsp");
                    break;
                case "user":
                    response.sendRedirect("User.jsp");
                    break;
                default:
                    response.sendRedirect("Login.jsp");
                    break;
            }
        } else {

            request.setAttribute("errMessage", userRole);

            request.getRequestDispatcher("Login.jsp").forward(request, response);
            response.sendRedirect("index.html");
        }
    }

}
