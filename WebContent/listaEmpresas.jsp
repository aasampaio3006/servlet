<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.org.model.Empresa"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/removeEmpresa" var="linkServletRemoveEmpresa"/>
<c:url value="/formNovaEmpresa.jsp" var="linkNovaEmpresa"/>
<c:url value="/mostraEmpresa" var="linkServletMostraEmpresa"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>
  Lista de empresas: <br/>
    <ul>
      <c:forEach items="${empresas}" var="empresa">      
        <li>${empresa.nome} <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>  
        <a href="${linkServletMostraEmpresa}?id=${empresa.id}">Editar</a>
        <a href="${linkServletRemoveEmpresa}?id=${empresa.id}">Remove</a>        
        </li>       
      </c:forEach>  
    </ul>
    
    <a href="${linkNovaEmpresa}"><button type="button">Adcionar Empresa</button></a>
</body>
</html>