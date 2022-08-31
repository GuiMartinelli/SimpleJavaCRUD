package br.com.guimartinelli.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.guimartinelli.model.DataBase;
import br.com.guimartinelli.model.Movie;

public class ListMovies implements Command {

	@Override
	public String	run(HttpServletRequest req, HttpServletResponse res) {
		DataBase	db = new DataBase();
		List<Movie>	movies = db.listMovies();

		req.setAttribute("list", movies);
		return "forward:listMovies.jsp";
	}
}