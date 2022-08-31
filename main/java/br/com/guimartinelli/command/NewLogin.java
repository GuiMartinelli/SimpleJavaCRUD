package br.com.guimartinelli.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewLogin implements Command {
	
	@Override
	public String	run(HttpServletRequest req, HttpServletResponse res) {
		return "forward:formLogin.jsp";
	}
}