<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
	font-family:calibri;
	color:black;
	/* background-color: #343a40; */
	background-color: whitesmoke;
	font-weight: bolder;

}
* {
	margin: 0 auto;
	padding: 0;
}
:root{
--zero:0px;
}
td {
	line-height: 20px;
	text-align: center;
	padding-top:10px;
}
.div1{
	width: 350px;
	height: 450px;
	border: 1px solid red;
	margin-top: 30px;
	box-shadow: var(--zero) var(--zero) 10px 20px greenyellow;
	padding-top:40px;
	box-sizing: border-box;
	
}
</style>
</head>
<body>
<div class="div1">
		<form action="insertproduct" method="post" enctype="multipart/form-data">
	<table>
			<tr>
				<td>Category:</td>
				<td><input type="text" name="category">
				</td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name">
				</td>
			</tr>
			<tr>
				<td>Introduction:</td>
				<td><input type="text" name="intro">
				</td>
			</tr>

			<tr>
				<td>Image URL:</td>
				<td><input type="file" name="file">
				</td>
			</tr>
			<tr>
				<td>Quantity:</td>
				<td><input type="number" name="quantity" placeholder="In Piece">
				</td>
			</tr>
			<tr>
				<td>Price:</td>
				<td><input type="number" name="price" step="0.1"
					placeholder="$">
				</td>
			</tr>

			<tr>
				<td>In Stock:</td>
				<td><input type="checkbox" name="stock">
				</td>
			</tr>

			<tr>
				<td>Weight:</td>
				<td><input type="number" name="weight" placeholder="In Kg"
					step="0.1">
				</td>
			</tr>

			<tr>
				<td>Description:</td>
				<td><textarea type="text" name="description"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit">
				<input type="reset" value="Reset"></td>
				
			</tr>

	</table>
		</form>
</div>
</body>
</html>