package br.com.guimartinelli.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.guimartinelli.model.DataBase;
import br.com.guimartinelli.model.User;

public class CheckLogin implements Command {
	
	@Override
	public String	run(HttpServletRequest req, HttpServletResponse res) {
		String	login = req.getParameter("login");
		String	password = req.getParameter("password");
		HttpSession	session = req.getSession();

		DataBase	db = new DataBase();
		User		user = new User(login, password);
		if (db.checkLogin(user)) {
			session.setAttribute("login", user);
			return "redirect:ListMovies";
		}
		return "redirect:Login";
	}
}
