<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Geographic Area Classification List</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="icon" href="favicon.ico"/>
</head>
<body class="bg-fixed w-full bg-gradient-to-b from-blue-100 to-yellow-100 p-10">
    <h2 class="text-2xl text-center font-semibold mb-2">Geographic Area Classification List</h2>

    <h3 class="text-lg font-medium mb-2">Countries</h3>
    <ul class="grid grid-cols-5 gap-2 mb-6">
    <c:forEach var="area" items="${countries}">
        <li>
            <a
                href="${pageContext.request.contextPath}/geographic-areas-servlet?id=${area.getGeographicAreaId()}"
                class="underline text-blue-800"
            >
                ${area.getName()}
            </a>
        </li>
    </c:forEach>
    </ul>

    <h3 class="text-lg font-medium mb-2">Provinces</h3>
    <ul class="grid grid-cols-5 gap-2 mb-6">
    <c:forEach var="area" items="${provinces}">
        <li>
            <a
                href="${pageContext.request.contextPath}/geographic-areas-servlet?id=${area.getGeographicAreaId()}"
                class="underline text-blue-800"
            >
                ${area.getName()}
            </a>
        </li>
    </c:forEach>
    </ul>

    <h3 class="text-lg font-medium mb-2">CMAs/CAs</h3>
    <ul class="grid grid-cols-5 gap-2 mb-6">
    <c:forEach var="area" items="${CMAs}">
        <li>
            <a
                href="${pageContext.request.contextPath}/geographic-areas-servlet?id=${area.getGeographicAreaId()}"
                class="underline text-blue-800"
            >
                ${area.getName()}
            </a>
        </li>
    </c:forEach>
    </ul>

    <h3 class="text-lg font-medium mb-2">CMA/CA regions</h3>
    <ul class="grid grid-cols-5 gap-2 mb-6">
    <c:forEach var="area" items="${CMARegions}">
        <li>
            <a
                href="${pageContext.request.contextPath}/geographic-areas-servlet?id=${area.getGeographicAreaId()}"
                class="underline text-blue-800"
            >
                ${area.getName()}
            </a>
        </li>
    </c:forEach>
    </ul>
</body>
</html>
