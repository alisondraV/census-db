<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Geographic Area Classification List</title>
</head>
<body>
    <h2>Geographic Area Classification List</h2>
    <h3>Countries</h3>
    <c:forEach var="area" items="${countries}">
        <div>
            <a href="${pageContext.request.contextPath}/geographic-areas-servlet?id=${area.getGeographicAreaId()}">
                ${area.getName()}
            </a>
        </div>
    </c:forEach>

    <h3>Provinces</h3>
    <c:forEach var="area" items="${provinces}">
        <div>
            <a href="${pageContext.request.contextPath}/geographic-areas-servlet?id=${area.getGeographicAreaId()}">
                    ${area.getName()}
            </a>
        </div>
    </c:forEach>

    <h3>CMAs/CAs</h3>
    <c:forEach var="area" items="${CMAs}">
        <div>
            <a href="${pageContext.request.contextPath}/geographic-areas-servlet?id=${area.getGeographicAreaId()}">
                    ${area.getName()}
            </a>
        </div>
    </c:forEach>

    <h3>CMA/CA regions</h3>
    <c:forEach var="area" items="${CMARegions}">
        <div>
            <a href="${pageContext.request.contextPath}/geographic-areas-servlet?id=${area.getGeographicAreaId()}">
                    ${area.getName()}
            </a>
        </div>
    </c:forEach>
</body>
</html>
