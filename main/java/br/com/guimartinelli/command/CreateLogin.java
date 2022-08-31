package br.com.guimartinelli.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.guimartinelli.model.DataBase;
import br.com.guimartinelli.model.User;

public class CreateLogin implements Command {

	@Override
	public String	run(HttpServletRequest req, HttpServletResponse res) {
		String		login = req.getParameter("login");
		String		password = req.getParameter("password");

		DataBase	db = new DataBase();

		User		user = new User(login, password);

		db.addUser(user);

		return "redirect:Login";
	}
}
