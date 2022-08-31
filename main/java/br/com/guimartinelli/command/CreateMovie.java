package br.com.guimartinelli.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.guimartinelli.model.DataBase;
import br.com.guimartinelli.model.Movie;

public class CreateMovie implements Command {

	@Override
	public String	run(HttpServletRequest req, HttpServletResponse res) {
		String		name = req.getParameter("name");
		String		year = req.getParameter("year");
		String		director = req.getParameter("director");
		String		country = req.getParameter("country");

		DataBase	db = new DataBase();

		Movie	movie = new Movie(name, year, director, country);

		db.addMovie(movie);

		req.setAttribute("movie", name);
		return "forward:newMovie.jsp";
	}
}