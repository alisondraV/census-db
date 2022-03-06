<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Geographic Area</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="icon" href="favicon.ico"/>
</head>
<body class="bg-fixed w-full bg-gradient-to-b from-blue-100 to-yellow-100 p-10">
    <h2 class="text-xl font-semibold mb-2">
        <span class="underline">${area.getName()}</span> Geographic Area
    </h2>
    <div><b>Code:</b> ${area.getCode()}</div>
    <div><b>Level:</b> ${area.getReadableLevel()}</div>
    <div><b>Population:</b> ${area.getPopulation()}</div>
</body>
</html>
