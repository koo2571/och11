<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String chk = request.getParameter("chk");
	if(chk.equals("success")) out.println("회원가입");
	else 					  out.println("회원가입 실패");
%>
</body>
</html>