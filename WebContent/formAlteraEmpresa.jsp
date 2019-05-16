<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/alteraEmpresa" var="linkServletAlteraEmpresa"/>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<!--  enviando um requi��o post -->
    <!--  <form action="/servlet/novaEmpresa" method="post">-->
 <form action=${linkServletAlteraEmpresa} method="post">
        Nome: <input type="text" name="nome" value="${empresa.nome}" />
        Data Abertura: <input type="text" name="data" 
              value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>" />              
              <input type="hidden" name="id" value="${empresa.id}"/>
        <input type="submit" />
    </form>

</body>
</html>