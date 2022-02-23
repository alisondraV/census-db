<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Geographic Area Classification List</title>
</head>
<body>
    <jsp:useBean id="geoAreas" class="servlets.GeographicAreasServlet"/>
    <h2>Geographic Area Classification List</h2>
    <c:forEach var="area" items="${geoAreas.list}">
        ${area}&nbsp;
    </c:forEach>
</body>
</html>
