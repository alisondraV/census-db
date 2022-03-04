<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Geographic Area Classification List</title>
</head>
<body>
    <h2>Geographic Area Classification List</h2>
    <c:forEach var="area" items="${areasList}">
        <div>
            <a href="${pageContext.request.contextPath}/geographic-areas-servlet?id=${area.geographicAreaId}">
                ${area.name}
            </a>
        </div>
    </c:forEach>
</body>
</html>
