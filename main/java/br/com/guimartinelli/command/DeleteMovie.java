package br.com.guimartinelli.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.guimartinelli.model.DataBase;

public class DeleteMovie implements Command {
	
	@Override
	public String	run(HttpServletRequest req, HttpServletResponse res) {
		Long	id = Long.valueOf(req.getParameter("id"));

		DataBase	db = new DataBase();
		db.deleteMovie(id);

		return "redirect:ListMovies";
	}
}
