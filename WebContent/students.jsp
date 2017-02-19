<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.bo.javawebmvc.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 
	<%
		List<Student> students = (List<Student>)request.getAttribute("students");
	%>
	<table>
		<tr>
			<th> id</th>
			<th>studentNamt</th>
			<th>gender</th>
		</tr>
		<%
			for(Student student :students){
		%>
			<tr>
				<td><%=student.getId() %></td>
				<td><%= student.getStudentName() %></td>
				<td><%= student.getGender() %></td>
			</tr>
		<%
			}
		%>
	</table>
</body>
</html>