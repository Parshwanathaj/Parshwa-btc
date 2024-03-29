package com.employeeapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AppController extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		System.out.println("From AppController Class..");
		String name = "Mr./Ms. " + request.getParameter("tname");

		ServletContext context = request.getServletContext();
		context.setAttribute("username", name);

		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");

		HttpSession session = request.getSession();

		session.setAttribute("login", "manish@yahoo.com");
		session.setMaxInactiveInterval(60);

		rd.forward(request, response);

	}

}