<!DOCTYPE html>
<%@ page import="java.util.List, br.com.guimartinelli.model.*"%>
<html>
	<body>
		<h1>Movies :</h1>
		<ul>
			<%
				List<Movie>	list = (List<Movie>)request.getAttribute("list");
				for (Movie movie : list) {
			%>

			<li><%= movie.get_name() %>
				<a href="http://localhost:9090/servlet/MovieData?id=<%= movie.get_id() %>">edit</a>
				<a href="http://localhost:9090/servlet/DeleteMovie?id=<%= movie.get_id() %>">delete</a>
			</li>

			<%
				}
			%>
		</ul>
		<a href="http://localhost:9090/servlet/NewMovie">Create new Movie</a>
	</body>
</html>
