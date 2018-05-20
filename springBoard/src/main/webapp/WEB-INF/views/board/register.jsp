<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
</head>
<form action="/board/register" method="post">
<body>
    <h1>게시판 글등록</h1>
 
    <table>
	<tr>
		<td>제목</td>
		<td><input type="text" name="title"></td>
	</tr>
	<tr>
		<td>내용</td>
		<td><textarea name="content" rows="" cols=""></textarea></td>
	</tr>
	<tr>
		<td>작성자</td>
		<td><input type="text" name="writer"></td>
	</tr>
    </table>
	
	<input type="submit"> 
</form>	   
</body>
</html>
