package br.com.guimartinelli.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.guimartinelli.model.DataBase;
import br.com.guimartinelli.model.Movie;

public class MovieData implements Command {
	
	@Override
	public String	run(HttpServletRequest req, HttpServletResponse res) {
		Long	id = Long.valueOf(req.getParameter("id"));
		
		DataBase	db = new DataBase();
		Movie		movie = db.getById(id);

		req.setAttribute("movie", movie);
		return "forward:formEditMovie.jsp";
	}
}
