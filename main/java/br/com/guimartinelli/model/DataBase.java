package br.com.guimartinelli.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataBase {
	private final static List<User>		users = new ArrayList<>();
	private final static List<Movie>	movies = new ArrayList<>();
	private static long					uid = 0;

	public void	addMovie(Movie movie) {
		movie.set_id(uid++);
		movies.add(movie);
	}
	
	public void	addUser(User user) {
			users.add(user);
		}

	public boolean	checkLogin(User usr) {
		if (usr == null)
			return false ;
		for (User user : DataBase.users) {
			if (usr.get_password().equals(user.get_password()))
				return true ;
		}
		return false;
	}

	public List<Movie>	listMovies() {
		return movies;
	}

	public Movie	getById(long id) {
		for (Movie movie : DataBase.movies) {
			if (movie.get_id() == id)
				return movie;
		}
		return null;
	}

	public void	deleteMovie(long id) {
		Iterator<Movie>	it = movies.iterator();

		while (it.hasNext()) {
			Movie	temp = it.next();
			
			if (temp.get_id() == id) {
				it.remove();
			}
		}
	}
}