package com.capgemini.share.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = { "*.do" }, loadOnStartup = 1)
public class ShareController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ShareController() {
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String path = request.getServletPath();
		
		if (path.contentEquals("/AdminServlet.do")) {
			String email = request.getParameter("email");
			RequestDispatcher dispatcher = request.getRequestDispatcher("display.jsp");
			request.setAttribute("email", email);
			dispatcher.forward(request, response);
			
			
		}
	}

}
