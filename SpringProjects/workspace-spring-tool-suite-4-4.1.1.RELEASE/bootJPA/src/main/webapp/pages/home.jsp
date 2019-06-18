<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REST ALIEN API</title>
</head>
<body>

-----------------------------------------------------------------------
			Insert an Alien
-----------------------------------------------------------------------
	<form action="addAlien">
		
		ID: <input type ="text" name="aid"><br> 
		NAME: <input type ="text" name="aname"><br>
		LANG: <input type="text" name="alang"><br>
		
		<input type="submit">
		
	</form>
-----------------------------------------------------------------------
			Get an Alien
-----------------------------------------------------------------------
	<form action="getAlien">
		
		ID: <input type ="text" name="aid"><br> 
		<input type="submit">
		
	</form>
	
	<br>Results: ${alien}<br>
	
----------------------------------------------------------------------
			Get an Alien By Technology
-----------------------------------------------------------------------
	<form action="getAlienByTech">
		
		ID: <input type ="text" name="alang"><br> 
		<input type="submit">
		
	</form>
	
	<br>Results: ${alien}<br>
	
-----------------------------------------------------------------------
			Update an Alien
-----------------------------------------------------------------------
	
	<form action="updateAlien">
		
		ID: <input type ="text" name="aid"><br> 
		NAME: <input type ="text" name="aname"><br>
		LANG: <input type="text" name="alang"><br>
		
		<input type="submit">
		
	</form>

-----------------------------------------------------------------------
			Delete an Alien
-----------------------------------------------------------------------

<form action="deleteAlien">
		
		ID: <input type ="text" name="aid"><br> 
		<input type="submit">
		
	</form>
</body>
</html>