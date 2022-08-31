<%@page import="br.com.guimartinelli.model.Movie" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	<body>
		<form action="/servlet/EditMovie" method="post">
			<% Movie movie = (Movie)request.getAttribute("movie"); %>
			Name: <input type="text" name="name" value="<%= movie.get_name() %>"><br>
			Year: <input type="number" name="year" value="<%= movie.get_year() %>"><br>
			Director: <input type="text" name="director" value="<%= movie.get_director() %>"><br>
			Country: <input type="text" name="country" value="<%= movie.get_country() %>"><br>
			<input type="hidden" name="id" value="<%= movie.get_id() %>">

			<input type="submit">
		</form>
	</body>
</html>