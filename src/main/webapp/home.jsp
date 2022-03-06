<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Group Project 1</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="icon" href="favicon.ico"/>
</head>
<body class="h-screen text-center bg-gradient-to-b from-blue-100 to-yellow-100">
    <h1 class="text-2xl font-semibold mt-8">Group Project 1</h1>
    <h2 class="text-2xl font-medium">Prepared by Alisa Vynohradova and Andrii Denysenko</h2>
    <br/>
    <a href="${pageContext.request.contextPath}/geographic-areas-servlet" class="text-lg underline text-blue-800">
        Geographic Areas
    </a>
    <br/>
    <a href="${pageContext.request.contextPath}/ages-servlet?year=2016" class="text-lg underline text-blue-800">
        2016 Ages List
    </a>
    <br/>
    <a href="${pageContext.request.contextPath}/ages-servlet?year=2011" class="text-lg underline text-blue-800">
        2011 Ages List
    </a>
</body>
</html>