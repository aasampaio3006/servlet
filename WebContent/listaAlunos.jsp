<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, br.org.model.Aluno"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Lista de Alunos: <br/>
    <ul>
    <c:forEach items="${alunos}" var="aluno">
     <li>${aluno.value}</li>
    </c:forEach>
    </ul>

<br/>
Laço: <br/>
    <c:forEach var="i" begin="1" end="10" step="2">
       <li>${i}</li>
     </c:forEach>

</body>
</html>