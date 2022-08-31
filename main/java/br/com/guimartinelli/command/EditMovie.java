package br.com.guimartinelli.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.guimartinelli.model.DataBase;
import br.com.guimartinelli.model.Movie;

public class EditMovie implements Command {
	
	@Override
	public String	run(HttpServletRequest req, HttpServletResponse res) {
		Long	id = Long.valueOf(req.getParameter("id"));

		DataBase	db = new DataBase();
		Movie		movie = db.getById(id);

		movie.set_name(req.getParameter("name"));
		movie.set_year(req.getParameter("year"));
		movie.set_director(req.getParameter("direset_director"));
		movie.set_country(req.getParameter("country"));

		return "redirect:ListMovies";
	}
}
