<%@ page import="test.EMP" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Fadeev
  Date: 11.04.2016
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
    <c:forEach var="listValue" items="${persons}">
      </br>
      <a href="person?id=${listValue.empNo}">${listValue.ename}</a>
    </c:forEach>


  </body>
</html>
