<%@page import="br.com.guimartinelli.model.Movie" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	<body>
		<h2>Create Login</h2>
		<form action="/servlet/CreateLogin" method="post">
			Login: <input type="text" name="login"><br>
			Year: <input type="password" name="password"><br>

			<input type="submit">
		</form>
	</body>
</html>