<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
</head>
<body>
    <h1>게시판 목록</h1>
 
    <table>
        <thead>
            <tr>
                <th>title</th>
                <th>writer</th>
                <th>regdate</th>
                <th>viewcnt</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="boardVO">
                <tr>
                    <td>${member.title}</td>
                    <td>${member.writer}</td>
                    <td>${member.regdate}</td>
                    <td>${member.viewcnt}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
