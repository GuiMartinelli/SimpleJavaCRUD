package br.com.guimartinelli.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hello")
public class hello extends HttpServlet {

	@Override
	protected void	service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter	out = res.getWriter();
	
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>SAY HELLO TO YOUR FIRST SERVLET</h1>");
		out.println("</body>");
		out.println("</hmtl>");

		System.out.println("Hello Servlet called");
	}
}
