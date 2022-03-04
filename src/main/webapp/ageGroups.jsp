<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Geographic Area Classification List</title>
</head>
<body>
    <h2>Geographic Area Classification List</h2>
    <c:forEach var="area" items="${areasList}">
        ${area}&nbsp;
    </c:forEach>
</body>
</html>
