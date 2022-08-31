<%@page import="br.com.guimartinelli.model.Movie" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	<body>
		<h2>Login</h2>
		<form action="/servlet/CheckLogin" method="post">
			Login: <input type="text" name="login"><br>
			Year: <input type="password" name="password"><br>
			<input type="submit"><br><br>

			<a href="/servlet/NewLogin">Register</a>
		</form>
	</body>
</html>