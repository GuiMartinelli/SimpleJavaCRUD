package br.com.guimartinelli.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.guimartinelli.command.Command;
import br.com.guimartinelli.model.DataBase;
import br.com.guimartinelli.model.User;

@WebServlet(urlPatterns = "/")
public class Controller extends HttpServlet {
	
	@Override
	public void	service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String[]	split = req.getRequestURI().split("/");
		String		uri =  split[split.length - 1];
		String		className = "br.com.guimartinelli.command." + uri;
		String		ret;
		HttpSession	session = req.getSession();
		boolean		pageAllowed = uri.equals("Login")
							|| uri.equals("CheckLogin")
							|| uri.equals("NewLogin")
							|| uri.equals("CreateLogin");
		User		user = (User) session.getAttribute("login");
		DataBase	db = new DataBase();

		if (!pageAllowed && !db.checkLogin(user)) {
			res.sendRedirect("Login");
			return ;
		}

		try {
			final Class c = Class.forName(className);
			final Command com = (Command) c.newInstance();
			ret = com.run(req, res);
			String[]	actPath = ret.split(":");
			if (actPath[0].equals("forward")) {
				RequestDispatcher	rd = req.getRequestDispatcher("WEB-INF/view/" + actPath[1]);
				rd.forward(req, res);
			} else
				res.sendRedirect(actPath[1]);
		} catch (ClassCastException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			throw new ServletException();
		}
	}
}
