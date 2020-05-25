<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<style>
<link rel="stylesheet" type="text/css" href="../css/style.css"/>
<meta charset="UTF-8">
h2{
text-align:center;
}
</style>
</head>
<body>

		<h2>Save Your Notes.</h2>
		<form action="addStudent" class="form-data">
		<div class="menu">
			<input type="text" name = "aid" placeholder="Enter id" required><br><br>
			<input type="text" name ="aname" placeholder="Enter Name" required><br><br>
			<input type="text" name ="sub" placeholder="Enter Sub" required><br><br>
			<textarea type="text" rows="10" cols="50" name="des" placeholder="Description" required>
			</textarea>
			<!-- <input type="text" name ="des" placeholder="Description"> --><br><br>
			<!-- <input type ="submit"> -->
			<button type="submit">Save Me!</button>
			</form>
			
		</div>
			<!-- 	<form action="getStudent">
			<input type="text" name = "aid">
		
			<input type ="submit">
			</form>
			 -->
</body>
</html>