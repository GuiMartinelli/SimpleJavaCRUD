package br.com.guimartinelli.model;

public class Movie {
	private String	_name;
	private String	_year;
	private String	_director;
	private String	_country;
	private long	_id;

	public Movie(String name, String year, String director, String country) {
		_name = name;
		_year = year;
		_director = director;
		_country = country;
	}

	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_year() {
		return _year;
	}
	public void set_year(String _year) {
		this._year = _year;
	}

	public String get_director() {
		return _director;
	}
	public void set_director(String _director) {
		this._director = _director;
	}

	public String get_country() {
		return _country;
	}
	public void set_country(String _country) {
		this._country = _country;
	}

	public long get_id() {
		return _id;
	}
	public void set_id(long _id) {
		this._id = _id;
	}
}
