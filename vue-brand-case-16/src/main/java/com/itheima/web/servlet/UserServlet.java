package com.itheima.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author shenjie
 * @version 1.0
 */

@WebServlet("/user/*")
public class UserServlet extends BaseServlet{

    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(" user select.....");
    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println(" user add.....");
    }
}
